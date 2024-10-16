package Project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Age: ");
            age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Invalid age, please enter again.");
                takeData();
                if (age < 0) {
                    throw new ArithmeticException("Age should be Positive");
                }
            }

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            if (doesRollNumberExist(rollNumber, "processed_students.txt")) {
                System.out.println("Roll number already exists. Overriding the existing data.");
                removeStudentByRollNumber(name, "processed_students.txt");
            }

            // First semester subjects
            int[] marksSem1 = new int[5];
            int[] creditsSem1 = {4, 3, 4, 2, 4};
            System.out.println("Enter marks for 1st semester: ");
            System.out.print("Enter total marks for the subjects: ");
            int totalMarksSem1 = scanner.nextInt();
            marksSem1[0] = enterMarksForSubject(scanner, "JAVA PROGRAMMING (4 Credit)", totalMarksSem1);
            marksSem1[1] = enterMarksForSubject(scanner, "MPCO (3 Credit)", totalMarksSem1);
            marksSem1[2] = enterMarksForSubject(scanner, "DSA (4 Credit)", totalMarksSem1);
            marksSem1[3] = enterMarksForSubject(scanner, "CPI (2 Credit)", totalMarksSem1);
            marksSem1[4] = enterMarksForSubject(scanner, "Mathematics (4 Credit)", totalMarksSem1);

            // Second semester subjects
            int[] marksSem2 = new int[4];
            int[] creditsSem2 = {4, 4, 3, 3};
            System.out.println("Enter marks for 2nd semester: ");
            System.out.print("Enter total marks for the subjects: ");
            int totalMarksSem2 = scanner.nextInt();
            marksSem2[0] = enterMarksForSubject(scanner, "Mathematics (4 Credit)", totalMarksSem2);
            marksSem2[1] = enterMarksForSubject(scanner, "Python (4 Credit)", totalMarksSem2);
            marksSem2[2] = enterMarksForSubject(scanner, "Operating System (3 Credit)", totalMarksSem2);
            marksSem2[3] = enterMarksForSubject(scanner, "Computer Networks (3 Credit)", totalMarksSem2);


            Student student = new Student(name, age, rollNumber, marksSem1, creditsSem1, marksSem2, creditsSem2);
            students.add(student);
        }

        displayAndSaveStudentData(students, "processed_students.txt");

        System.out.println("\nStudent details, SGPA, and CGPA saved to processed_students.txt.");
    }

    private static int enterMarksForSubject(Scanner scanner, String subject, int totalMarks) {
        int marksObtained;
        while (true) {
            System.out.print("Enter marks obtained for " + subject + ": ");
            marksObtained = scanner.nextInt();

            if (marksObtained > totalMarks) {
                System.out.println("Error: Marks obtained cannot be more than total marks. Please try again.");
            } else {
                break;
            }
        }
        return marksObtained;
    }

    private static boolean doesRollNumberExist(int rollNumber, String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Roll Number: " + rollNumber)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void removeStudentByRollNumber(String name, String fileName) {
        File inputFile = new File(fileName);
        File tempFile = new File("tempFile.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            boolean skip = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Name: " + name)) {
                    skip = true;
                }
                if (line.trim().isEmpty()) {
                    skip = false;
                }
                if (!skip) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!inputFile.delete()) {
            System.out.println("Could not delete file");
        }
        if (!tempFile.renameTo(inputFile)) {
            System.out.println("Could not rename file");
        }
    }

    private static void displayAndSaveStudentData(List<Student> students, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            for (Student student : students) {
                String studentDetails = "\n-------------------------------------\n" +
                        "Name: " + student.getName() +
                        "\nAge: " + student.getAge() +
                        "\nRoll Number: " + student.getRollNumber() +
                        "\nSGPA (Semester 1): " + student.getSGPASem1() +
                        "\nSGPA (Semester 2): " + student.getSGPASem2() +
                        "\nCGPA: " + student.getCGPA();

                // Write the details
                writer.write(studentDetails);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }
}