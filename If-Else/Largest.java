import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number--> ");
        int First = input.nextInt();

        System.out.print("Enter the second number--> ");
        int Second = input.nextInt();

        if(First>Second)
        {
            System.out.println(First + " is largest");
        }
        else
        {
            System.out.println(Second + " is largest");
        }
    }
}
