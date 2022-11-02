import java.util.Scanner;

class Age
{
    public static void eligible (int a)
    {
        if (a>=18)
        {
            System.out.println("You are eligible");
        }
        else
        {
            System.out.println("You are not eligible");
        }
    }
}

public class Vote {
    public static void main(String[] Args)
    {
        int b;
        System.out.print("Enter your age--> ");
        Scanner input = new Scanner(System.in);
        b = input.nextInt();

        Age.eligible(b);
    }
}
