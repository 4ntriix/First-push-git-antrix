package Antrix;
import java.util.Scanner;
public class AgeClassifier {

    static class Person {
        int age;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        }

        void classify() {
            if (age <= 0) {
                System.out.println("You are not born yet.");
            } else if (age < 13) {
                System.out.println("You are a Child.");
            } else if (age < 20) {
                System.out.println("You are a Teenager.");
            } else if (age < 60) {
                System.out.println("You are an Adult.");
            } else {
                System.out.println("You are a Senior.");
            }
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.input();
        p.classify();
    }
}
