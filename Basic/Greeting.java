import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter a Name-=> ");
        Scanner input = new Scanner(System.in);
        String Name = input.next();
        System.out.println("Welcome! " + Name);
    }
}
