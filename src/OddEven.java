/*
6. Write a java program to input any number and find out if it’s odd or even
 */


import java.util.Scanner;

public class OddEven
{
    public void oddEve()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value : ");
        int n = sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("Even No..");
        }
        else
        {
            System.out.println("Odd No..");
        }
    }

    public static void main(String[] args)
    {
        OddEven oe = new OddEven();
        oe.oddEve();
    }
}
