package apcsaProjects2223;

public class ProjectPolindrome10112022 {
    public static void main(String[] args) {
        String str = "radar";
        boolean b1 = true;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                System.out.println("polindrome");
            }
            else{
                System.out.println("not polidrome");
                break;
            }
        }
    }
}
