package apcsaProjects2223;

import java.util.Scanner;

public class ProjectBrowser09202022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What browser do you use?");
        String browser = scanner.nextLine();

        if(browser.equals("Safari")){
            System.out.println("It is a valid browser");
        }
        else if(browser.equals("Firefox")){
            System.out.println("It is a valid browser");
        }
        else if(browser.equals("Chrome")){
            System.out.println("It is a valid browser");
        }
        else if(browser.equals("Opera")){
            System.out.println("It is a valid browser");
        }
        else{
            System.out.println("That is an invalid browser");
        }
    }
}
