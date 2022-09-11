import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter the principal amount--> ");
        Scanner input = new Scanner(System.in);
        float P= input.nextFloat();
        System.out.print("Enter the rate of interest--> ");
        float R= input.nextFloat();
        System.out.print("Enter the time period--> ");
        Scanner input3 = new Scanner(System.in);
        float T= input.nextFloat();

        float S_I = (P*R*T)/100;

        System.out.println("The Simple Interest is --> "+ S_I);



    }
}
