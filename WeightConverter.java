package Antrix;
import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the weight converter program!");
        System.out.println("OPTION (1): lbs to kg");
        System.out.println("OPTION (2): kg to lbs");
        System.out.println("Enter any other numerical key to exit");
        System.out.print("Choose a correct option according to your preference of conversion: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You chose OPTION (1) - converting from lbs to kg.");
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight / 2.20462;
            System.out.println("The converted weight from " + weight + " lbs is " + newWeight + " kilograms.");
        } else if (choice == 2) {
            System.out.println("You chose OPTION (2) - converting from kg to lbs.");
            System.out.print("Enter the weight in kg: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The converted weight from " + weight + " kilograms is " + newWeight + " lbs.");
        } else {
            System.out.println("Exiting program. Invalid option.");
        }

        System.out.println("Thank you for using the weight converter :)");
        sc.close();
    }
}
