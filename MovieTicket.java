package Antrix;
import java.util.Scanner;
public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String movie = "";
        double originalPrice = 0.0;
        System.out.print("Choose a movie:\n1. Oppenheimer (₹250)\n2. Avengers Endgame (₹300)\n3. My Fault (₹200)\n4. The Boys (₹220)\n5. Overlord (₹180)\nEnter option (1-5): ");
        choice = sc.nextInt();
        if (choice == 1) {
            movie = "Oppenheimer";
            originalPrice = 250;
        } else if (choice == 2) {
            movie = "Avengers Endgame";
            originalPrice = 300;
        } else if (choice == 3) {
            movie = "My Fault";
            originalPrice = 200;
        } else if (choice == 4) {
            movie = "The Boys";
            originalPrice = 220;
        } else if (choice == 5) {
            movie = "Overlord";
            originalPrice = 180;
        } else {
            System.out.print("Invalid movie selection.\n");
            return;
        }
        sc.nextLine();
        System.out.print("Are you a student? (yes/no): ");
        String student = sc.nextLine().toLowerCase();

        System.out.print("Are you a senior citizen? (yes/no): ");
        String senior = sc.nextLine().toLowerCase();

        boolean isStudent = student.equals("yes");
        boolean isSenior = senior.equals("yes");

        double finalPrice = originalPrice;

        if (isStudent && isSenior) {
            finalPrice = finalPrice * 0.8;
            finalPrice = finalPrice * 0.7;
        } else if (isStudent) {
            finalPrice = finalPrice * 0.8;
        } else if (isSenior) {
            finalPrice = finalPrice * 0.7;
        }

        System.out.print("You bought a ticket for: " + movie + "\n");
        System.out.print("Original Ticket Price: ₹" + originalPrice + "\n");

        if (isStudent && isSenior) {
            System.out.print("You received both Student (20%) and Senior Citizen (30%) discounts.\n");
        } else if (isStudent) {
            System.out.print("You received a 20% Student discount.\n");
        } else if (isSenior) {
            System.out.print("You received a 30% Senior Citizen discount.\n");
        } else {
            System.out.print("You don't get any discounts.\n");
        }

        System.out.print("Final Ticket Price after discounts: ₹" + finalPrice + "\n");
    }
}

