package lessons2022;

public class Java21_ReturnMethods {
    /*
    These methods can use any type of data type, prim or non-prim
    does not have void as a return type
    must return a value
    returning value must match with return type
    method must be closed with return statement, with return it exits the method
    return are either printed or assigned to the other variable
    you can put return in main method
     */

    public static int averageOfThree(int a, int b, int c){
        return((a+b+c)/3);
    }

    public static int maxOfTwo(int a, int b){
        return(Math.max(a,b));
    }

    public static void a0Tree(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void m0Two(int a, int b){
        System.out.println(Math.max(a,b));
    }



    public static void main(String[] args) {
        System.out.println(averageOfThree(3,7,8)+maxOfTwo(5,7));
    }
}
