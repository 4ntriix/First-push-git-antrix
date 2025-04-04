package Antrix;
import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    double math, science, english;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        math = sc.nextDouble();

        System.out.print("Enter marks in Science: ");
        science = sc.nextDouble();

        System.out.print("Enter marks in English: ");
        english = sc.nextDouble();
    }
    void reportCard() {
        double total = math + science + english;
        double average = total / 3;

        System.out.println("\n----- Report Card -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNo);
        System.out.println("Math       : " + math);
        System.out.println("Science    : " + science);
        System.out.println("English    : " + english);
        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Average    : " + average);

        String grade = average >= 90 ? "A+" :
                average >= 75 ? "A" :
                        average >= 60 ? "B" :
                                average >= 40 ? "C" : "Fail";
        System.out.println("Grade      : " + grade);
    }
}

public class ReportCard {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        s1.reportCard();
    }
}
