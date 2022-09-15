import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        System.out.println("Enter the character--> ");
        char ch = input.next().charAt(0);
        
        if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u')
        {
            System.out.println("The entered character is a Vowel");
        }
        else
        {
            System.out.println("The entered character is Consonant");
        }

    }
}
