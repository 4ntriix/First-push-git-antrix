package Antrix;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;
        System.out.println("HELLO:) \nWelcome to the Mad-Libs Game \nGive desired inputs to get your Mad-Libs Story");
        System.out.print("Enter an Adjective (DESCRIPTION): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a Noun (Animal/Person): ");
        noun  = sc.nextLine();
        System.out.print("Enter an Adjective (DESCRIPTION): ");
        adjective2 = sc.nextLine();
        System.out.print("Enter an Verb (ENDING WITH -ing): ");
        verb = sc.nextLine();
        System.out.print("Enter an Adjective (DESCRIPTION): ");
        adjective3 = sc.nextLine();
        System.out.println("Today I went to a " + adjective1 + " zoo");
        System.out.println( noun + " was " +adjective2 + "and" + verb + "!!!");
        System.out.println("I was " + adjective3 + "!!");


    }
}
