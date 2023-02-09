package lessons2022;

public class Java19_WrapperClass11012022 {
    public static void main(String[] args) {
        /*
        Wrapper class is dedicated to its primitives
        Wrapper class names start with capital letter
        Every primitive has its own wrapper class
        Wrapper class is different than primitves since they are objects

        Wrapper class
        Byte      Null
        Short     Null
        Long      Null
        Float     Null
        Double    Null
        Boolean   Null
        Char      Null
         */

        // Boxing and Autoboxing
        int a = 3;
        Integer b = a;

        // Unboxing
        // If you assign/convert wrapper to primitve is unboxing
        Character c = 'A';
        char c2 = c; //unboxing

        //you can convert a integer into a double
        int g = 3;
        double f = g;

        Integer h = 3;

        //Wrapper class methods
        int maxNumberOfGivenTwoInt = Integer.max(3,6);
        int maxNumberOfIntClass = Integer.MAX_VALUE;
        System.out.println(maxNumberOfIntClass);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Integer.sum(3,6));

        String str = "123";
        int number = 123;
        System.out.println(Integer.toString(123)); //convert to string
        System.out.println(Integer.valueOf(str)); //Convert string to int
        double p = 3.2;
        double k = (int)p; //removes decimal
        System.out.println(k);

    }
}
