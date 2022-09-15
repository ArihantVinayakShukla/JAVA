import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first no.--> ");
        int First = input.nextInt();
        System.out.print("Enter the second no.--> ");
        int Second = input.nextInt();

        if(First>Second)
        {
            System.out.println("The answer is--> "+ (First-Second));
        }
        else
        {
            System.out.println("The answer is--> "+ (Second-First));
        }
    }
}