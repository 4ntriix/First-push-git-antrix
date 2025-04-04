package Antrix;
import java.util.Scanner;

public class AnimalSounds {

    abstract static class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        public void makeSound() {
            System.out.println("Dog says: Woof woof!");
        }
    }

    static class Cat extends Animal {
        public void makeSound() {
            System.out.println("Cat says: Meow!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal (dog/cat): ");
        String input = sc.next().toLowerCase();

        Animal animal;

        if (input.equals("dog")) {
            animal = new Dog();
        } else if (input.equals("cat")) {
            animal = new Cat();
        } else {
            System.out.println("Unknown animal.");
            sc.close();
            return;
        }

        animal.makeSound();
        sc.close();
    }
}
