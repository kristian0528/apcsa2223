package apcsaProjects2223;

public class ProjectMiddleChar09292022 {
    public static void main(String[] args) {
        String str = "Kristian";
        int num = ("Kristian".length()) / 2 - 1;
        int num2 = ("Kristian".length())/2;
        if(str.length()%2==0) {
            System.out.println(str.charAt(num+num2));
        }
        else{
            System.out.println(num);
        }
    }
}
