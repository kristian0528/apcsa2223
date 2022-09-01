package lessons2022;

import java.util.Scanner;

public class Java5_ScannerClass08302022 {
    public static void main(String[] args) {
        /*
        SCANNER CLASS
        scanner class is being used to get input from the user
        but we need to input java.util.Scanner

        DECLERATION
        scanner scanner = new scanner(Scanner.in);
        when you are asking user input use appropriate data type
        String name = scanner.nextLine();
        int age = scanner.nextIn();
        double price = scanner.nextDouble();
        boolean trueOrFalse = scanner.nextBoolean();
        String lastName = scanner.next();
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.next(); //this only takes the first word/part of the input
        System.out.println("your name is "+name);
        System.out.println("what is your last name ");
        String name2 = scanner.nextLine(); //this takes the entire line
        System.out.println("your name is "+name2);

        //System.out.println("what about the age?");
        //int age = scanner.nextInt();
        //System.out.println("your age is" +age);
        //System.out.println("what about the price ");
        //double price = scanner.nextDouble();
        //boolean trueOrFalse = scanner.nextBoolean();

        //TASK
        /*
        ask the following questions to the user and print everything at once
        name and last name in one line, age, student id number, school name
         */

        //Scanner scanner = new Scanner(System.in);
        System.out.println("What is your full name");
        String name3 = scanner.nextLine();
        System.out.println("What is your age");
        int age = scanner.nextInt();
        System.out.println("Your school name?");
        String school = scanner.nextLine();
        System.out.println("your id number?");
        long idNumber = scanner.nextLong();
        System.out.println("ok your name is "+ name3 + "and you are "+age + "and you go to "+school + "with an id number of "+idNumber);

    }
}
