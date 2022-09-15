package warmUps;

import java.util.Scanner;

public class warmUp09152022
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number 1-7 to determine the day of the week");
        int day = scanner.nextInt();

        if(day==1){
            System.out.println("It is sunday");
        }
        if(day==2){
            System.out.println("It is monday");
        }
        if(day==3){
            System.out.println("It is tuesday");
        }
        if(day==4){
            System.out.println("It is wednesday");
        }
        if(day==5){
            System.out.println("It is thursday");
        }
        if(day==6){
            System.out.println("It is friday");
        }
        if(day==7){
            System.out.println("It is saturday");
        }
        if(day<=0&&day>=8){
            System.out.println("That is an invalid number for a day");
        }
    }
}
