package lessons2022;

public class Java20_Methods {
        //  grouping a series of statements together to perform specific tasks to like functions
        //  methods can make our codes reusable, you do not need to repeat same statements
        //  without main method you can't run anything or any java application
        //  you can't create a method without a method
        //  methods must be declared or created within a class
        //  we call the methods by their name
        //  void method - does not return any value
        //  you can't create two main methods within the same class/ within a main method
        //  you can call one method within another method
        /*
        Public           Static           void         main        (String[] args)       {}
  -------------------------------------------------------------------------------------------------------
        access          specifier        return       method           arguments       method
        modifier                         type         name                              body
  -------------------------------------------------------------------------------------------------------
         */

        // Void methods without parameters
        // Declaration of a method
    public static void myFirstMethod(){
        System.out.println("Hello world");
        System.out.println("How are you doing today?");
        System.out.println("Trent is a good student");
        System.out.println("They say he is not");
    }

    //Create a method that prints numbers from 0 to 100 name it oneToHundred
    public static void oneToHundred(){
        for(int i = 0; i<=100 ; i++){
            System.out.println(i+" ");
        }
    }

    // create a method which finds a number is even or odd
    public static void evenOrOdd(int a){
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    // create a method to find sum or 2 numbers
    public static void sumOf2(int b,int c){
        System.out.println(b+c);
    }

    // create a method that removes duplicates from the string and print out the result
    public static void removeDuplicates(String str){
        String result = "";
        for( int i = 0 ; i<str.length(); i++){
            if(!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        System.out.println(result);
    }

    // create a method that converts miles to km
    public static void kmToMl(double d)
    {
        System.out.println(d*0.620934);
    }
    public static void mlToKm(double d)
    {
        System.out.println(d*1.60934);
    }


    public static void main(String[] args) {
        // how to call a method with its name
        myFirstMethod();
        oneToHundred();
        evenOrOdd(4);
        sumOf2(3,5);
        removeDuplicates("Mustafa");
        kmToMl(3.5);
        mlToKm(6.7);
    }
}
