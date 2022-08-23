public class Java3_ArithmithicOperators
{
    public static void main(String[] args) {

        //Arithmetic Variables
        // Priority is just like pemdas
//        Operator          Use         Description         Example
/*
             +              x+y         adds x and y        3+7=10
             -              x-y         subtracts x and y   10-8=2
             *              x*y         multiplies x and y  5*5=25
             /              x/y         divides x and y     8/4=2
             %              x%y         remainder           8%6=2
            (-)             -x          negative x          a=-3
            ++              x++         increases num by 1  a++
            --              --x         decreases num by 1  a--
 */
        System.out.println(3+7);//10
        System.out.println(8-2);//6
        System.out.println(3*3);//9
        System.out.println(8/2);//4
        System.out.println(10%4);//6

        int a =3;
        int b =5;   //int will give you non decimal answer (which is 0)
        double c = 3;
        double d = 5;   //double will give the actual decimal answer (0.6)

        System.out.println(a/b);
        System.out.println(c/d);

        //Concatination

        System.out.println("collection of 5 and 3 is "+5+3);//putting numbers together will be considered text
        System.out.println("collection of 5 and 3 is "+(5+3));//correct way to input numbers in order for them to solve
        System.out.println(5*2.3);  //it will return a float number
        int number = 3;
        System.out.println(number);
        System.out.println(number++);//increases number for next time it's printed

        //Casting
        //converts data types to another
        double dd = -3.9;
        System.out.println(dd);
        int asdf = (int)dd;   //this casting is only going to take the whole number part
        System.out.println((int)dd );

        //Implicit Casting
        double d1 = 3000;
        long l = asdf;
        System.out.println(d1);
        System.out.println(l);

        //Explicit Casting
        double price = 200.55;
        System.out.println((int)price);

        //Shorthand Operators
        int number3 = 5;
        number 3 = 5+5; //10
        number3+=5;//number3 = 5+5
        System.out.println(number3);
        int numberA = 33;
        numberA+=22;
        System.out.println(numberA);
        numberA*=3;
        System.out.println(numberA);
        numberA/=3;
        System.out.println(numberA);
        numberA-=9;
        System.out.println(numberA);
        numberA%=3;
        System.out.println(numberA);

    }
}
