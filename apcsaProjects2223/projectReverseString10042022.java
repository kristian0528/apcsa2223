package apcsaProjects2223;

public class projectReverseString10042022 {
    public static void main(String[] args) {
        String str = "Java";
        String reverseStr = "";

        for(int i = 0; i<str.length();i++){
            reverseStr+=str.charAt(str.length()-i-1);
        }
        System.out.println(reverseStr);
    }
}
