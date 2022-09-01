package warmUps;

import java.util.Scanner;

public class warmUp09012022 {
    public static void main(String[] args) {
        System.out.println("put the number you wat to convert from gallon to liter ");
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(d +" gallons equals to ="+(d*3.785) +" liters");
    }
}
