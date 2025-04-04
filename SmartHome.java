package Antrix;
import java.util.Scanner;
public class SmartHome {
    abstract static class Device {
        abstract void turnOn();
        abstract void turnOff();
    }
    static class Light extends Device {
        void turnOn() {
            System.out.println("Light turned ON.");
        }
        void turnOff() {
            System.out.println("Light turned OFF.");
        }
    }
    static class Fan extends Device {
        void turnOn() {
            System.out.println("Fan turned ON.");
        }
        void turnOff() {
            System.out.println("Fan turned OFF.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Smart Home Device Control");
        System.out.println("1. Light\n2. Fan");
        System.out.print("Choose a device: ");
        int choice = sc.nextInt();

        Device device;
        if (choice == 1) {
            device = new Light();
        } else if (choice == 2) {
            device = new Fan();
        } else {
            System.out.println("Invalid device selected.");
            return;
        }

        System.out.println("1. Turn ON\n2. Turn OFF");
        System.out.print("Choose an action: ");
        int action = sc.nextInt();

        if (action == 1) device.turnOn();
        else if (action == 2) device.turnOff();
        else System.out.println("Invalid action selected.");

        sc.close();
    }
}
