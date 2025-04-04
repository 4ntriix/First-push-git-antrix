package Antrix;
import java.util.Scanner;
public class BMICalculator {

    static class Person {
        double heightCm;
        double weight;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your height in centimeters: ");
            heightCm = sc.nextDouble();
            System.out.print("Enter your weight in kilograms: ");
            weight = sc.nextDouble();
        }

        double bmi() {
            double heightMeters = heightCm / 100.0;
            return weight / (heightMeters * heightMeters);
        }

        void result() {
            double bmi = bmi();
            System.out.println("Your BMI is: " + bmi);
            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi < 25) {
                System.out.println("You have a normal weight.");
            } else if (bmi < 30) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.input();
        person.result();
    }
}
