import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        System.out.print("Enter the number--> ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (a%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
