package warmUps;

public class warmUp09082022
{
    public static void main(String[] args) {
        int n1=3, n2=3, n3=4;

        if(n1==n2&&n2==n3){
            System.out.println("They are all equal");
        }
        else if(n1==n2&&n2!=n3)
        {
            System.out.println("n1 equals to n2");
        }
        else if(n2==n3&&n2!=n1)
        {
            System.out.println("n2 equals to n3");
        }
        else if(n1==n3&&n1!=n2)
        {
            System.out.println("n1 equals to n3");
        }
        else
        {
            System.out.println("None of them equals");
        }

    }
}
