package apcsaProjects2223;

import java.util.Scanner;

public class projectFullPyramid10042022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of level you want");
        int numberOfLevels = scanner.nextInt();
        String bricks = "";
        String spaces = "";
        for(int i = 0,j = 1; i<numberOfLevels;i++){
            System.out.println(j);
            bricks+="-";
            spaces+="";
            j+=2;

        }
    }
}
