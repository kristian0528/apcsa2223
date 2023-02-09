package lessons2022;

public class Java25_AccessModifiers01102023 {
    /*
    Access modifiers          Same class        Same package       Sub-classes      Everywhere else
    public                         Y                  Y                Y                   Y
    protected                      Y                  Y                Y                   N
    default                        Y                  Y                N                   N
    private                        Y                  N                N                   N


     */


    public String myPublicVariable="myPublicName";
    protected String myProtectedVariable="my Protected Variable";
    String myDefaultVariable="My Default Variable";
    private String myPrivateVariable = "myPrivateVariable";

}

class newClass{

}