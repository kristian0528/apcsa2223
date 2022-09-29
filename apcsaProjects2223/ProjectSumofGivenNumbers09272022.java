package apcsaProjects2223;

import java.util.Scanner;

public class ProjectSumofGivenNumbers09272022 {
    public static void main(String[] args)
    {
        System.out.println("Enter a number you want to find the sum off all of the numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("sum =  "+ (a*(a+1))/2);

    }
}