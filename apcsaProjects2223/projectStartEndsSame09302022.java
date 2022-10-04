package apcsaProjects2223;

import java.util.Scanner;

public class projectStartEndsSame09302022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();
        int length = word.length();
        if(word.charAt(0)==word.charAt(length-1))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
