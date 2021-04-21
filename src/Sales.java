/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%

 */

import java.util.Scanner;

public class Sales
{
    public void sale()
    {
        int saleId, saleAmt,basicSalary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input sales Id : ");
        saleId = sc.nextInt();

//        System.out.print("Input seller's name : ");
//       String sellerName = sc.nextLine();

        System.out.print("Input seller amount : ");
        saleAmt = sc.nextInt();

        System.out.print("Input Basic Salary : ");
        basicSalary = sc.nextInt();

        int salePercentage;
        double saleCommission;

        if (saleAmt >= 50000)
        {
            salePercentage = 35;
            System.out.println(salePercentage);
            System.out.println(saleAmt);
            saleCommission = salePercentage*saleAmt/100;
            System.out.println("Commission Amount : " + saleCommission);
        }
        else if (saleAmt >= 30000)
        {
            salePercentage = 20;
            saleCommission = salePercentage*saleAmt/100;
            System.out.println("Commission Amount : " + saleCommission);
        }
        else if (saleAmt >= 20000)
        {
            salePercentage = 10;
            saleCommission = salePercentage*saleAmt/100;
            System.out.println("Commission Amount : " + saleCommission);
        }
        else if (saleAmt >= 10000)
        {
            salePercentage = 5;
            saleCommission = salePercentage*saleAmt/100;
            System.out.println("Commission Amount : " + saleCommission);
        }
        else
        {
            salePercentage = 2;
            saleCommission = salePercentage*saleAmt/100;
            System.out.println("Commission Amount : " + saleCommission);
        }
    }

    public static void main(String arg[])
    {
        Sales sales = new Sales();
        sales.sale();
    }
}
