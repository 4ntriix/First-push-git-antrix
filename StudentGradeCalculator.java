package Antrix;
import java.util.Scanner;
public class StudentGradeCalculator {

    static class Student {
        String name;
        int roll;
        double marks;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            System.out.print("Enter roll number: ");
            roll = sc.nextInt();
            System.out.print("Enter marks (out of 100): ");
            marks = sc.nextDouble();
        }
    }

    static class GradeCalculator extends Student {

        void displayGrade() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll No: " + roll);
            System.out.println("Marks: " + marks);
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 75) {
                System.out.println("Grade: A");
            } else if (marks >= 60) {
                System.out.println("Grade: B");
            } else if (marks >= 40) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: F (Fail)");
            }
        }
    }

    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        gc.input();
        gc.displayGrade();
    }
}
