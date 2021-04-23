/*
3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
 */

import java.util.Scanner;

public class Marks
{

    public int getMaths (int maths)
    {
        if (maths < 0 || maths > 100)
        {
            System.out.println("Invalid input, Marks should between 0 to 100");
        }
        return maths;
    }

    public int getScience(int science)
    {
        if (science < 0 || science > 100)
        {
            System.out.println("Invalid input, Marks should between 0 to 100");
        }
        return science;
    }

    public int getEnglish(int english)
    {
        if (english < 0 || english > 100)
        {
            System.out.println("Invalid input, Marks should between 0 to 100");
        }
        return english;
    }

    public String getResult(double percentage)
    {
        String p = "PASS", f = "FAIL";
        if (percentage < 35)
        {
            return f;
        }
        else
        {
            return p;
        }
    }

    public String getGrade(double percentage)
    {
        String g;
        if (percentage >= 80)
        {
            return g = "A+";
        }
        else if (percentage >= 60)
        {
            return g = "A";
        }
        else if (percentage >=50)
        {
            return g = "B";
        }
        else
        {
            return g = "C";
        }
    }


    public static void main(String[] args)
    {
        String name;
        int roll_no, maths, science, english, total;
        double percentage;

        Marks marks = new Marks();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        name = sc.nextLine();

        System.out.print("Enter Roll no : ");
        roll_no = sc.nextInt();

        System.out.print("Enter Maths Marks : ");
        maths = sc.nextInt();
        int m = marks.getMaths(maths);

        System.out.print("Enter Science Marks : ");
        science = sc.nextInt();
        int s = marks.getScience(science);

        System.out.print("Enter English Marks : ");
        english = sc.nextInt();
        int e = marks.getEnglish(english);

        total = maths + science + english;
        percentage = total * 100 / 300;

        String result = marks.getResult(percentage);
        String grade = marks.getGrade(percentage);

        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("|         Name : " + name + "        |");
        System.out.println("|     Roll No  : " + roll_no + "          |");
        System.out.println("|_____________________________|");
        System.out.println("|     Subjects  :  Marks      |");
        System.out.println("|_____________________________|");
        System.out.println("|         Maths : " + m + "          |");
        System.out.println("|       Science : " + s + "          |");
        System.out.println("|       English : " + e + "          |");
        System.out.println("|_____________________________|");
        System.out.println("|         Total : " + total + "         |");
        System.out.println("|_____________________________|");
        System.out.println("|    Percentage : " + percentage+ "        |");
        System.out.println("|        Result : " + result + "        |");
        System.out.println("|         Grade : " + grade + "           |");
        System.out.println("|_____________________________|");
    }
}
