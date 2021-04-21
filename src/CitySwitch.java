import java.util.Scanner;

/*
9. Same as above program-8 using switch statement.
 */
public class CitySwitch
{
    public void cityName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capital letter between 'A' to 'F' : ");
        String alpha = sc.nextLine();

        switch (alpha)
        {
            case "A" :
                System.out.println("Ahmedabad");
                break;
            case "B" :
                System.out.println("Bangalore");
                break;
            case "C" :
                System.out.println("Chhattisgarh");
                break;
            case "D" :
                System.out.println("Delhi");
                break;
            case "E" :
                System.out.println("Eachur");
                break;
            case "F" :
                System.out.println("Faridabad");
                break;
            default :
                System.out.println("Invalid Alphabet...");
                break;
        }
    }

    public static void main(String[] args)
    {
        CitySwitch cs = new CitySwitch();
        cs.cityName();
    }
}
