package Antrix;
import java.util.Scanner;
public class TemperatureCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;
        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        unit = sc.next().toUpperCase();
        newTemp = (unit.equals("C")) ? (temp-32)*5/9 : (temp * 5/9) + 32;
        System.out.println( +newTemp+"°" +unit);
    }
}
