import java.util.Scanner;

public class Currrency {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the currency in rupees--> ");
        float Rupee = input.nextFloat();
        System.out.println("The rupee in USD is--> "+ Rupee*0.0126);
    }
}
