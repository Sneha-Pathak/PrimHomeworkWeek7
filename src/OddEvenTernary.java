import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEvenTernary
{
    public void oddEven()
    {
        //input value using scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        // java odd or even
        String strOutput = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + strOutput);
        sc.close();
    }

    public static void main(String[] args)
    {
        //method calling
        OddEvenTernary oe = new OddEvenTernary();
        oe.oddEven();

    }
}
