package Antrix;
import java.util.Scanner;
public class CompoundInterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currency = '$';
        double principal;
        double rate;
        double compoundedTime;
        int tenure;
        double finalAmount;
        //INPUTS
        System.out.print("Enter the principal AMOUNT: ");
        principal = sc.nextDouble();
        System.out.print("Enter the interest rate: ");
        rate = sc.nextDouble()/100;
        System.out.print("Enter the Tenure: ");
        tenure = sc.nextInt();
        System.out.print("Enter the no of times amount is compounded: ");
        compoundedTime = sc.nextDouble();
        //OUTPUT
         finalAmount = principal * Math.pow( 1 + rate / compoundedTime, compoundedTime * tenure);
        System.out.println("The AMOUNT after "+tenure+" year/s will be: "+currency+" "+finalAmount);
    }
}
