package warmUps;

import java.util.Scanner;

public class warmUp09062022
{
    public static void main(String[] args) {
        System.out.println("What is your grade?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 60) {
            System.out.println("Fail");
        }
        if (num >= 60&&num > 90) {
            System.out.println("Pass");
        }
        if (num >= 90) {
            System.out.println("Passed with distinction");
        }
    }
}
