import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number--> ");
        int f = input.nextInt();

        int fact = 1;
        for(int i=1; i<=f; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
