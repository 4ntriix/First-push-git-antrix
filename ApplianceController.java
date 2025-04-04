package Antrix;
import java.util.Scanner;
public class ApplianceController {

     static abstract class Appliance {
        abstract void turnOn();
        abstract void turnOff();
    }

    static class Fan extends Appliance {
        void turnOn() {
            System.out.println("Fan is now ON.");
        }

        void turnOff() {
            System.out.println("Fan is now OFF.");
        }
    }
    static class Light extends Appliance {
        void turnOn() {
            System.out.println("Light is now ON.");
        }

        void turnOff() {
            System.out.println("Light is now OFF.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Appliance appliance;

        System.out.println("Choose appliance to control:");
        System.out.println("1. Fan");
        System.out.println("2. Light");
        int choice = sc.nextInt();

        if (choice == 1) {
            appliance = new Fan();
        } else if (choice == 2) {
            appliance = new Light();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        System.out.println("Do you want to turn it ON or OFF? (Type 'on' or 'off'):");
        String action = sc.next().toLowerCase();

        if (action.equals("on")) {
            appliance.turnOn();
        } else if (action.equals("off")) {
            appliance.turnOff();
        } else {
            System.out.println("Invalid action!");
        }
        sc.close();
    }
}
