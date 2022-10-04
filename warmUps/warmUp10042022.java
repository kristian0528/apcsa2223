package warmUps;

import java.util.Scanner;

public class warmUp10042022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Last name?");
        String lastName = scanner.nextLine();

        System.out.println(name.charAt(0)+"."+lastName.charAt(0)+".");
    }
}
