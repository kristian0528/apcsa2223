package warmUps;

public class warmUp01172023 {
    public static void main(String[] args) {
        System.out.println(stringReplicate("hi",3));
    }

    public static String stringReplicate(String str, int a){
        String s = "";
        for(int i=0; i<a; i++){
            s+=str;
        }
        return s;
    }

}
