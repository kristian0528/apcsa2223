package lessons2022;

public class Java22_Overload {
    /*
    Method overloads
    -It allows more than one method with the same name, but different parameters
    -It improves reusability
    -Return type does not need to be the same
    -You can even overload main method
     */

    public static int takeAverage(int a, int b){
        return (a+b)/2;
    }
    public static int takeAverage(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        System.out.println(takeAverage(4,8));
        System.out.println(takeAverage(4,8,6));
    }
}
