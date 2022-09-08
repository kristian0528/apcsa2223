package apcsaProjects2223;

import java.util.Scanner;

public class ProjectGrades09062022 {
    public static void main(String[] args) {
        System.out.println("I will calculate your average between 3 subjects");
        System.out.println("What is your English grade?");
        Scanner scanner = new Scanner(System.in);
        int Eng = scanner.nextInt();
        System.out.println("What is your Math grade?");
        int Math = scanner.nextInt();
        System.out.println("What is your history grade?");
        int His = scanner.nextInt();

        int Avr = ((Eng+Math+His)/3);
        if (Avr >= 90&&Avr <= 100) {
            System.out.println("Your average is an A");
        }
        if (Avr >= 80&&Avr <= 89) {
            System.out.println("Your average is a B");
        }
        if (Avr >= 70&&Avr <= 79) {
            System.out.println("Your average is a C");
        }
        if (Avr >= 60&&Avr <= 69) {
            System.out.println("Your average is a D");
        }
        if (Avr >= 0&&Avr <= 59) {
            System.out.println("Your average is a F");
        }
    }
}
