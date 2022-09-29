package lessons2022;

public class Java13_ContinueandBreakStatements09272022 {
    public static void main(String[] args) {
        //break
        //used for exiting switch statements and loops
        //continue used in the loop skips

        int lucky = 69;

        for(int i = 0 ; i<100 ; i++){
            if(i==lucky){
                System.out.println(i);
                break;
            }
        }
    }
}
