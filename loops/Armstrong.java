import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])
    {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number--> ");
        int num = input.nextInt();
        int num2 = num;
        int result = 0;
        while (num2 != 0)
        {
            double remainder = num2 % 10;
            result += Math.pow(remainder,3);
             num2 = num2 / 10;
        }
        if(result == num)
        {
            System.out.println(num +" is Armstrong");
        }
        else
        {
            System.out.println(num +" is not an Armstrong number");
        }
    }
}
