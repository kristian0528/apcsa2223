package lessons2022;

public class Java27_Encapsulation01172023 {
    /*
    encapsulation enables private variable/methods to be enable from outside of the class with setter and getter methods
    this keyword lets you use the instance variable within the class, if they hve same namevarible as argument
     */

    String name = "alex";
    String LastName = "alex's last name";
    private int SSN = 1234567;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
}

class anotherClass{
    public static void main(String[] args) {
        Java27_Encapsulation01172023 object1 = new Java27_Encapsulation01172023();
        object1.name = "not alex";
        System.out.println(object1.name);
        System.out.println(object1.getSSN());
    }

}
