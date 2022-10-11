package apcsaProjects2223;

import java.util.Scanner;

public class projectFirstTwoLastTwo09302022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.nextLine();
        int length = word.length();
        if(word.substring(0,1).equals(word.charAt(length-1)))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
