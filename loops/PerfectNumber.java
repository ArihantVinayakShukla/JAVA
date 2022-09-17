import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number--> ");
        int num = input.nextInt();
        int a=0;
        for(int i=1; i<num; i++)
        {
            if(num%i == 0)
            {
                a+=i;
            }
        }
        if(a==num)
        {
            System.out.println(num+ " is a perfect number");
        }
        else
        {
            System.out.println(num+ " is not a perfect number");
        }
    }
}
