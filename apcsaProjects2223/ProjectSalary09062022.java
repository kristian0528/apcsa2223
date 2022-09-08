package apcsaProjects2223;

import java.util.Scanner;

public class ProjectSalary09062022 {
    public static void main(String[] args) {
        System.out.println("What is your salary?");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        if (salary < 30000) {
            System.out.println("You must earn at least $30000");
        }
        if (salary >= 30000) {
            System.out.println("You qualify in the salary section.");
        }

        System.out.println("How many years have you worked this job?");
        int yearOnJob = scanner.nextInt();

        if(yearOnJob>=2){
            System.out.println("You qualify for the loan");
        }
        else{
            System.out.println("You must have been on job for at least 2 years60");
        }
    }
}
