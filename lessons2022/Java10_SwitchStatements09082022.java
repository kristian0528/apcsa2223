package lessons2022;

public class Java10_SwitchStatements09082022
{
    public static void main(String[] args) {
        //Switch statement can be used for limited case it is defined by an expression which can be
        //string boolean or integer here it is how we will use
        //break will break the code and end the block

        int h = 0;
        switch(h)
        {
            case 1:
                System.out.println("It is number1");
                break;
            case 2:
                System.out.println("It is number2");
                break;
            case 3:
                System.out.println("It is number3");
                break;
            default:
                System.out.println("default case");

        }
    }
}
