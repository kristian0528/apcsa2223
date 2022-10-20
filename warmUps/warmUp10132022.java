package warmUps;

import java.util.Scanner;

public class warmUp10132022 {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Welcome to my calculator, to continue press the enter key and to quit press q");
            Scanner scanner2 = new Scanner(System.in);
            String qOrC = scanner2.nextLine();
            if (qOrC.equalsIgnoreCase("q")) {
                System.exit(0);
            }
            else{}
            System.out.println("Welcome to my calculator");
            System.out.println("Enter first number");
            Scanner scanner = new Scanner(System.in);
            int firstNum = scanner.nextInt();
            System.out.println("Enter second number");
            int secondNum = scanner.nextInt();
            System.out.println("enter the operator + - * / %");
            Scanner scanner1 = new Scanner(System.in);
            String operator = scanner1.nextLine();
            if (operator.equals("+")) {
                System.out.println("The sum is " + (firstNum + secondNum));
            }
            if (operator.equals("-")) {
                System.out.println("The difference is " + (firstNum - secondNum));
            }
            if (operator.equals("*")) {
                System.out.println("The product is " + (firstNum * secondNum));
            }
            if (operator.equals("/")) {
                System.out.println("The dividend is " + (firstNum / secondNum));
            }
        }
    }
}
