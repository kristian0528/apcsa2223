package lessons2022;

public class Java14_StringClass09292022
{
    public static void main(String[] args) {
        //Declaration of a string
        String str1 = "Hello world";
        String str2 = new String("Hello world 2");

        //Strings are immutable
        //when you create a string it means unchangeable

        /*
        String pool
        Corresponds to an allocation of memory in java heap memory
        collection of string objects
         */

        //Strings are represented with sequence of characters

        String str = "Mustafa";

        //String manipulation methods
        //str.charAt(indexNumber);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));

        //LENGTH helps us get the length of a string

        System.out.println(str.length());
        System.out.println("Kristian".length());

        //Concation this will merge two strings
        System.out.println(str.concat(str2));
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //Trim removes spaces
        String str5 ="      T  rE  n T";
        System.out.println(str5.trim());

        //Substring creates a substring of the value from the beginning index number
        String str6 = "Nathaniel";
        System.out.println(str6.substring(0,3));
        System.out.println(str6.substring(3,6));
        System.out.println(str6.substring(5,9));

        //Replace replaces old value with new value
        String str7 = "seveneleven";
        System.out.println(str7.replace("e","a"));
        System.out.println(str7.replace("en",""));

        //Replacefirst only replace first char
        System.out.println(str7.replaceFirst("e","i"));

        //Index of
        String str8 = "Trent";
        System.out.println(str8.indexOf("T"));
        System.out.println(str8.indexOf('T'));
        System.out.println(str8.lastIndexOf('t'));
        System.out.println(str8.indexOf("e"));


        //Equals checks if two string are the same or not, returns boolean
        System.out.println("ali".equals("ali"));
        System.out.println("ali".equals("ali2"));
        System.out.println("ali".equals("Ali"));

        //contains check if strings contains the string
        System.out.println("Alexander".contains("Alex"));

        //Starts with if checks if the string starts with a string
        System.out.println("Alex".startsWith("A"));

        //Ends with checks if the string ends with a string
        System.out.println("Kristian".endsWith("n"));

        //System.out.println("Kristian".);   how to display all string methods
    }
}
