package lessons2022;

public class Java12_whileLoops09272022 {
    public static void main(String[] args) {
        //While loop
        //Helps you repeat the process as many times you need or want

        int a = 0;

        while(a<10){
            System.out.println("print this 10 times");
            a++; //this is the increment and will increase the value
        }

        //Do while loops
        //executes do statement whatever the condition then checks for while if it is valid

        int n = 10;
        do{
            System.out.println("n = "+n);
        }
        while(n>10);
    }

}
