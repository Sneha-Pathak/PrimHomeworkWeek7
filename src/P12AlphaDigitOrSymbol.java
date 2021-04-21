/*
12. Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;

public class P12AlphaDigitOrSymbol
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any character : ");
        char ch = scanner.next().charAt(0);

        // Using character class
        if (Character.isAlphabetic(ch))
        {
            System.out.println(ch + " is A ALPHABET.");
        }
        else if (Character.isDigit(ch))
        {
            System.out.println(ch + " is A DIGIT.");
        }
        else
        {
            System.out.println(ch + " is A SPECIAL CHARACTER OR SYMBOL.");
        }
    }
}
