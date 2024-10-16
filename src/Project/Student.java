package Project;

public class Student extends Person {
    private int rollNumber;
    private int[] marksSem1;
    private int[] creditsSem1;
    private int[] marksSem2;
    private int[] creditsSem2;
    private String[] grades;
    private double[] gradePoints;
    private double sgpaSem1;
    private double sgpaSem2;
    private double cgpa;

    public Student(String name, int age, int rollNumber, int[] marksSem1, int[] creditsSem1, int[] marksSem2, int[] creditsSem2) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marksSem1 = marksSem1;
        this.creditsSem1 = creditsSem1;
        this.marksSem2 = marksSem2;
        this.creditsSem2 = creditsSem2;
        this.sgpaSem1 = calculateSGPA(marksSem1, creditsSem1);
        this.sgpaSem2 = calculateSGPA(marksSem2, creditsSem2);
        this.cgpa = calculateCGPA();
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getSGPASem1() {
        return sgpaSem1;
    }

    public double getSGPASem2() {
        return sgpaSem2;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getGrade() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grades.length; i++) {
            sb.append("Subject ").append(i + 1).append(" Grade: ").append(grades[i]).append(", Grade Points: ").append(gradePoints[i]).append("\n");
        }
        return sb.toString();
    }

    private double calculateSGPA(int[] marks, int[] credits) {
        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < marks.length; i++) {
            double gradePoint = calculateGradePoint(marks[i]);
            totalGradePoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }
        return totalGradePoints / totalCredits;
    }

    private double calculateCGPA() {
        return (sgpaSem1 + sgpaSem2) / 2;
    }

    private String calculateGrade(int marks) {
        if (marks >= 80) return "AA";
        if (marks >= 73) return "AB";
        if (marks >= 66) return "BB";
        if (marks >= 60) return "BC";
        if (marks >= 55) return "CC";
        if (marks >= 50) return "CD";
        if (marks >= 45) return "DD";
        return "F";
    }

    private double calculateGradePoint(int marks) {
        if (marks >= 80) return 10.0;
        if (marks >= 73) return 9.0;
        if (marks >= 66) return 8.0;
        if (marks >= 60) return 7.0;
        if (marks >= 55) return 6.0;
        if (marks >= 50) return 5.0;
        if (marks >= 45) return 4.0;
        return 0.0;
    }
}