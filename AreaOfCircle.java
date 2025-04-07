package Antrix;
import java.util.Scanner;
class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double rad = sc.nextDouble();
        Circle circle = new Circle(rad);
        double area = circle.area();
        System.out.println("The area of the circle is: " + area);
        sc.close();
    }
}
