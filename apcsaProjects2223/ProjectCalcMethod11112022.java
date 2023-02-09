package apcsaProjects2223;

public class ProjectCalcMethod11112022 {
    public static void calculation(int a,int b,String c){
        if(c.equalsIgnoreCase("+"))
        {
            System.out.println(a+b);
        }
        else if (c.equalsIgnoreCase("-"))
        {
            System.out.println(a-b);
        }
        else if (c.equalsIgnoreCase("*"))
        {
            System.out.println(a*b);
        }
        else if (c.equalsIgnoreCase("/"))
        {
            System.out.println(a/b);
        }
        else if (c.equalsIgnoreCase("^"))
        {
            System.out.println(Math.pow(a, b));
        }
    }

    public static void main(String[] args) {
        calculation(5,4,"*");
    }
}
