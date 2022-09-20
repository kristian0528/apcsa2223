package apcsaProjects2223;

import java.util.Scanner;

public class ProjectShippingInfo09202022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your address?");
        String address = scanner.nextLine();
        System.out.println("What city do you live in?");
        String city = scanner.nextLine();
        System.out.println("State abbreviation for where you live?");
        String state = scanner.nextLine();
        System.out.println("What is your zip code?");
        int code = scanner.nextInt();
        System.out.println("And what is your full name?");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        System.out.println("Ship to:   "+name);
        System.out.println("                 "+address);
        System.out.println("                 "+city+", "+state+" "+code);
    }
}
