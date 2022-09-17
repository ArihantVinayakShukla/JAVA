import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter the number--> ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int c = 0;
        for(int i=2; i <= num/2; i++)
        {
            if(num%i==0)
            {
               c=1;
               break;
            }
        }
        if(c!=1)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Composite Number");
        }
    }
}
