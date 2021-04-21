import java.util.Scanner;

/*
8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class City
{
    public void cityName(String alphabet)
    {
        String cname;
        if (alphabet.equals("A"))
        {
            cname = "Ahmedabad";
            System.out.println(cname);
        }
        else if (alphabet.equals("B"))
        {
            cname = "Bangalore";
            System.out.println(cname);
        }
        else if (alphabet.equals("C"))
        {
            cname = "Chhattisgarh";
        }
        else if (alphabet.equals("D"))
        {
            cname = "Delhi";
            System.out.println(cname);
        }
        else if (alphabet.equals("E"))
        {
            cname = "Eachur";
            System.out.println(cname);
        }
        else if (alphabet.equals("F"))
        {
            cname = "Faridabad";
            System.out.println(cname);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capital letter between 'A' to 'F' : ");
        String city = scanner.nextLine();

        City c = new City();
        c.cityName(city);
    }
}
