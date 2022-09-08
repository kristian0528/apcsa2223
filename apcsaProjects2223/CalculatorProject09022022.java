package apcsaProjects2223;

import java.util.Scanner;

public class CalculatorProject09022022 {
    public static void main(String[] args) {
        System.out.println("Do you want to use +,-,*,/? Press +,-,*, or /");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        System.out.println("Give me a number");
        int number = scanner.nextInt();
        System.out.println("Give me another number");
        int number1 = scanner.nextInt();

        if (operator.equals("+")) {
            System.out.println("The sum is "+(number + number1));
        }
        if (operator.equals("-")) {
            System.out.println("The difference is "+(number - number1));
        }
        if (operator.equals("*")) {
            System.out.println("The product is "+(number * number1));
        }
        if (operator.equals("/")) {
            System.out.println("The dividend is "+(number / number1));
        }
    }
}
