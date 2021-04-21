/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */

import java.util.Scanner;

public class SymbolCalculator
{
    public void addition(int a,int b)
    {
        int c = a + b;
        System.out.println("Addition is : " + c);
    }
    public void subtraction(int a,int b)
    {
        int c = a - b;
        System.out.println("Subtraction is : " + c);
    }
    public void multiplication(int a, int b)
    {
        int c = a * b;
        System.out.println("Multiplication is : " + c);
    }
    public void division(int a, int b)
    {
        int c = a / b;
        System.out.println("Division is : " + c);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No1 : ");
        int x = sc.nextInt();
        System.out.print("Enter No2 : ");
        int y = sc.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter calculation symbol + , - , * , / : ");
        String symbol = s.nextLine();

        SymbolCalculator cal = new SymbolCalculator();

        if (symbol.equals("+"))
        {
            cal.addition(x,y);
        }
        else if (symbol.equals("-"))
        {
            cal.subtraction(x,y);
        }
        else if (symbol.equals("*"))
        {
            cal.multiplication(x,y);
        }
        else if (symbol.equals("/"))
        {
            cal.division(x,y);
        }
        else
        {
            System.out.println("Invalid symbol...");
        }
    }
}
