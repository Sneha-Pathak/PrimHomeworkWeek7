public class Person
{
    String firstName,lastName;
    int age;

    public String getFirstName ()
    {
        this.firstName = firstName;
        return firstName;
    }

    public String getLastName()
    {
        this.lastName = lastName;
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setFirstName(String firstName)
    {
       // System.out.println(firstName + "Hello");
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        //System.out.println(lastName + "Hi");
        this.lastName = lastName;
    }

    public void setAge(int age)
    {
        if (age > 0)
        { }
        else if (age < 100)
        { }
        else
            age = 0;
            this.age = age;
    }


    public boolean isTeen ()
    {
        if(age > 12 && age< 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //String fullName = firstName.concat(lastName);

//    public  getFullName()
//    {
//       return firstName + " " + lastName;
//    }

    public java.lang.String getFullName()
    {
        return firstName + "" + lastName;

    }

    public static void main(String[] args)
    {
        Person person = new Person();
        person.setFirstName(" "); // firstName is set to empty string
        person.setLastName(" "); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }


}
