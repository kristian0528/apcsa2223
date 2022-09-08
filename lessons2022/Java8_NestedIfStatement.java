package lessons2022;

import java.util.Scanner;

public class Java8_NestedIfStatement
{
    public static void main(String[] args) {
        int a = 3;
        if(a%2==0)
        {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        int firstAngle = 60;
        int secondAngle = 60;
        int thirdAngle = 60;

        if((firstAngle+secondAngle+thirdAngle)==180){
            System.out.println("This is a triangle");
        }
        else{
            System.out.println("This is not a triangle");
        }

        //How to compare a string within a condition

        String name = "nathaniel";

        if(name=="nathaniel"){
            System.out.println("The name is nathaniel");
        }
        else{
            System.out.println("Name is alejandro");
        }

        if(name.equals("nathaniel")||name.equalsIgnoreCase("Nathaniel"));
    }
}
