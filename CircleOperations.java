package Antrix;
import java.util.Scanner;
public class CircleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        // area = pi*r*r
        area = Math.PI * Math.pow(radius,2);
        // circumference = 2*pi*r
        circumference = 2*Math.PI*radius;
        //  volume = 4/3(pi*r*r*r)
        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.println("Area of Circle is: " +area);
        System.out.println("Circumference of the Circle is: " +circumference);
        System.out.println("Volume of the Circle is: " +volume);
    }
}
