package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectFirstLetter10252022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 5 words that I will take the first letters of, what's the first?");
        String word = scanner.nextLine();
        System.out.println("What's the second?");
        String word2 = scanner.nextLine();
        System.out.println("What's the third?");
        String word3 = scanner.nextLine();
        System.out.println("What's the fourth?");
        String word4 = scanner.nextLine();
        System.out.println("And the fifth?");
        String word5 = scanner.nextLine();
        String[] arr = {word,word2,word3,word4,word5};
        for(int i = 0;i<arr.length ; i++){
            System.out.println(arr[i].substring(0,3));
        }
    }
}
