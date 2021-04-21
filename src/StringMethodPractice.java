/*
Use of String predefined Methods
 */

import java.util.Locale;

public class StringMethodPractice
{
    public static void main(String[] args)
    {
        String line1 = "Hello Everyone";
        String line2 = "Hi Everyone";

        System.out.println(line1.length()); //gives length of String
        System.out.println(line1.charAt(3)); //returns a char value at the given index no
        System.out.println(line1.concat(" How are you?")); //combines specified string at the end of the string
        System.out.println(line1.contains("Everyone")); //returns true if chars are found in the string
        System.out.println(line1.startsWith("E")); //checks if this string starts with given prefix
        System.out.println(line1.endsWith("e")); //checks if this string ends with given prefix
        System.out.println(line1.equals(line2)); //compares the contents of two given strings
        System.out.println(line1.indexOf("l")); //returns index of given char value of substring
        System.out.println(line2.isEmpty()); //check if this string is empty
        System.out.println(line2.replace("Hi","Hey")); //returns a string replacing all old char to new char
        System.out.println(line2.substring(4)); //return a part of string
        System.out.println(line2.toCharArray()); //converts this string into char Array
        System.out.println(line2.toUpperCase(Locale.ROOT)); //return the string into upper letter
        System.out.println(line2.toLowerCase(Locale.ROOT)); //return the string into lower letter
        System.out.println(line2.trim()); //eliminates leading and trailing spaces
    }
}
