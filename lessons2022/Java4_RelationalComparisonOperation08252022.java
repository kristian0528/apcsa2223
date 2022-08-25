package lessons2022;

public class Java4_RelationalComparisonOperation08252022
{
    public static void main(String[] args) {
        //Relational/Comparison Operators
        /*
        Description                     Operator
            >                         Greater Than
           <=                    Greater than or equal to
            <                          Less than
           <=                     Less than or equal to
           ==                            Equal
           !=                          Not equal
         */
        System.out.println(6<3);
        System.out.println(6>3);
        System.out.println(6<=3);
        System.out.println(6>=3);
        System.out.println(6==3);
        System.out.println(3==3);
        System.out.println(6!=3);

        int a;
        a=9;
        int b=3;
        System.out.println("First number is greater than second number " + (a>b));

        //Logical Operators
        /*
          Operator
             &&        bitwise logical AND
             ||        bitwise logical inclusive OR
             ^         bitwise logical exclusive OR
         */
        //Has to have both conditions true
        System.out.println(true&&true);  //true
        System.out.println(true&&false); //false
        System.out.println(false&&true); //false
        System.out.println(false&&false);//false

        //Has to have one condition at least true
        System.out.println(true||true);  //true
        System.out.println(true||false); //true
        System.out.println(false||true); //true
        System.out.println(false||false);//false

        //If both conditions are the same it returns false if not it's true
        System.out.println(true^true);   //false
        System.out.println(true^false);  //true
        System.out.println(false^true);  //true
        System.out.println(false^false); //false

        System.out.println(!true); //false exclamation mark turns true to false

        /*
           Operators
       -(unary negation) !         Unary negation, logical NOT
            * / %                  Multiplication, division, modulus
             + -                   Addition, subtraction
          < > <= >=                Less than, Greater than, Less than or Equal to, Greater than or equal to
            == !=                  Equal to, not equal to
             &&                    Logical AND
             ||                    Logical OR
       = += -= *= /= %=            Assignment and combined assignments
         */
        int z=3 , x=4 , v=6;

    }
}
