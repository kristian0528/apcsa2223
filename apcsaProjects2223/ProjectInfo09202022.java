package apcsaProjects2223;

import java.util.Scanner;

public class ProjectInfo09202022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("Are you employeed? Yes or No");
        String employee = scanner.nextLine();

        if(employee.equals("Yes&&yes")) {
            System.out.println("What is your yearly salary?");
            int salary = scanner.nextInt();
            System.out.println("Full name: "+firstName+" "+lastName);
            System.out.println("Employeed status: Employeed");
            System.out.println("Salary: $"+salary);
        }
        else if(employee.equals("No&&no")){
            System.out.println("Full name: "+firstName+" "+lastName);
            System.out.println("Employeed status: Not employeed");
            System.out.println("Salary: $0");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
