package Antrix;
import java.io.IOException;
import java.io.FileWriter;

public class Antrix {
    public static void main(String[] args){
        try{
            FileWriter f1 = new FileWriter("Example.txt");
            f1.write("Java is the best programming language");
            f1.close();

        } catch (IOException e) {
            System.out.println("IO EXCEPTION OCCURED");
        }
        System.out.println("Successfully wrote in the file");


    }
}
