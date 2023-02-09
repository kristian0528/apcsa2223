package lessons2022;

public class Java28_StaticKeyword01192023 {
    static String natName = "Nathaniel";
    static int natAge = 12;

}

class Static2{
    public static void main(String[] args) {
        //System.out.println(Java28_StaticKeyword01192023.natAge);
        //System.out.println(Java28_StaticKeyword01192023.natName);
        Java28_StaticKeyword01192023 java28StaticKeyword01192023 = new Java28_StaticKeyword01192023();
        System.out.println(java28StaticKeyword01192023.natName);
    }
}
