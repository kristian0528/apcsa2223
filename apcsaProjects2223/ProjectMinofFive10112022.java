package apcsaProjects2223;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectMinofFive10112022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int[] arr = {a,b,c,d,e};

        System.out.println(Arrays.stream(arr).max());
    }
}
