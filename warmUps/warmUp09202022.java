package warmUps;

import java.util.Scanner;

public class warmUp09202022
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your yearly salary?");
        double salary = scanner.nextInt();
        System.out.println("And how many hours do you work in a week?");
        int hours = scanner.nextInt();

        double hourly = ((salary/52)/hours);
        System.out.println("Your hourly pay is "+"$"+hourly);
    }
}
