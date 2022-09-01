package lessons2022;

import java.util.Scanner;

public class Java7_IfStatements09012022 {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("You are able to vote");
        } else {
            System.out.println("You can't vote bum");
        }

        System.out.println("Give me 3 different numbers");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first number ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number ");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number ");
        int number3 = scanner.nextInt();

        if (number1 > number2) {
            if (number1 > number3)
                System.out.println("The highest number is " + number1);
        }
        if (number2 > number1) {
            if (number2 > number3)
                System.out.println("The highest number is " + number2);
        }
        if (number3 > number1) {
            if (number3 > number2)
                System.out.println("The highest number is " + number3);
        }

        System.out.println("Type two numbers to check if they are equal or not");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 == n2) {
            System.out.println("These numbers are equal");
        } else {
            System.out.println("These numbers aren't equal");
        }

        System.out.println("This system greets you please enter the time as hour");
        int hour = scanner1.nextInt();
        if (hour < 12) {
            System.out.println("Good Morning");
        }
        if (hour > 12 && hour < 15) {
            System.out.println("Good Afternoon");
        }
        if(hour>15){
            System.out.println("Good Evening");
        }

        // Nested if statements

        boolean isWeekday ;
        boolean weatherIsSunny ;

        if(isWeekday==true){
            if(weatherIsSunny==true){
                System.out.println("picnic");
            }
        }
        else{
            System.out.println("Tv");
        }
        else{
            System.out.println("School");
        }

        if(3<6){
            System.out.println("3 is smaller than 6");
        }
        else if(1<5)
    }