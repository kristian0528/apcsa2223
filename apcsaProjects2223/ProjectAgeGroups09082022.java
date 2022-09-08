package apcsaProjects2223;

public class ProjectAgeGroups09082022
{
    public static void main(String[] args) {
        int age = 26;

        if(age<1){
            System.out.println("It is an infant");
        }
        else if(age>=3&&age<=5){
            System.out.println("It is a toddler");}
        else if(age>=6&&age<=9){
            System.out.println("It is a kid");}
        else if(age>=10&&age<=12){
            System.out.println("It is a pre-teen");}
        else if(age>=13&&age<=17){
            System.out.println("It is a teenager");}
        else if(age>=18&&age<=20){
            System.out.println("It is a young adult");}
        else if(age>=21&&age<=39){
            System.out.println("It is an Adult");}
        else if(age>=40&&age<=49){
            System.out.println("It is a young middle aged adult");}
        else if(age>=50&&age<=54){
            System.out.println("It is a middle aged adult");}
        else if(age>=55&&age<=64){
            System.out.println("It is a very young senior citizen");}
        else if(age>=65&&age<=74){
            System.out.println("It is a young senior citizen");}
        else if(age>=75&&age<=84){
            System.out.println("It is a senior citizen");}
        else if(age>=85&&age<=120){
            System.out.println("It is a old senior citizen");}
        else if(age<0&&age>120){
            System.out.println("invalid entry");}
        else{System.out.println("Invalid");}

        if(5>4)
            System.out.println("5 greater than 3");

        //This is not a good habit, always use curly brackets
    }
}
