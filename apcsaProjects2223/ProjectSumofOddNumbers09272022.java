package apcsaProjects2223;

public class ProjectSumofOddNumbers09272022 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0 ; i<100 ; i++){
            if(i%1==0){
                sum = sum+i;
                System.out.println(sum);
            }
        }
    }
}
