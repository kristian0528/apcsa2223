package apcsaProjects2223;

public class ProjectHi12092022 {
    public static boolean startsWithHi(String str) {
        if(str.startsWith("hi")) {
            return true;
        }
        else if(str.length()<2){
            return false;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(startsWithHi("high"));
    }
}
