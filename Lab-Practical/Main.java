/*
 * Consider an example of declaring the examination result. Design three classes:
 * Student, Exam, and Result. The Student class has data members such as those
 * representing rollNumber, Name, etc. Create the class Exam by inheriting Student
 * class. The Exam class adds fields representing the marks scored in six subjects.
 * Derive Result from the Exam class, and it has its own fields such as total_marks.
 * Write an interactive program to model this relationship.
 */

import java.util.Scanner;

class Student {
    int rollNumber;
    String name;

    void setStudentDetails(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

class Exam extends Student {
    int[] marks = new int[6];

    void setMarks(int[] marks) {
        this.marks = marks;
    }

    void displayMarks() {
        System.out.println("Marks in 6 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

class Result extends Exam {
    int totalMarks;

    void calculateTotalMarks() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
    }

    void displayResult() {
        displayStudentDetails();
        displayMarks();
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Result result = new Result();

        
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        
        result.setStudentDetails(rollNumber, name);

        
        int[] marks = new int[6];
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        
        result.setMarks(marks);
        result.calculateTotalMarks();

        
        result.displayResult();

        scanner.close();
    }
}