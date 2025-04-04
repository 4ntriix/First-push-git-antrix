package Antrix;
import java.util.Scanner;

public class UnitConverter {

    interface Converter {
        void convert();
    }
    static class CmToM implements Converter {
        public void convert() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value in centimeters: ");
            double cm = sc.nextDouble();
            double meters = cm / 100;
            System.out.println(cm + " cm is " + meters + " meters.");
        }
    }

    static class MToCm implements Converter {
        public void convert() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value in meters: ");
            double m = sc.nextDouble();
            double cm = m * 100;
            System.out.println(m + " meters is " + cm + " cm.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unit Converter");
        System.out.println("1. Centimeters to Meters");
        System.out.println("2. Meters to Centimeters");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        Converter converter;
        if (choice == 1) {
            converter = new CmToM();
        } else if (choice == 2) {
            converter = new MToCm();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        converter.convert();
        sc.close();
    }
}
