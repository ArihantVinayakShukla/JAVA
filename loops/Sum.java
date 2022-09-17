import java.util.Scanner;

public class Sum {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number--> ");
        int num = input.nextInt();
        int rem;
        int sum=0;

        while(num!=0)
        {
            rem= num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println("The sum of the digits of number is--> "+sum);
    }
}
