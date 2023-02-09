package apcsaProjects2223;

public class ProjectInitials11152022 {
    public static String projectInitials(String a,String b){
        return a.substring(0,1)+"."+b.substring(0,1);
    }

    public static void main(String[] args) {
        System.out.println(projectInitials("Kristian","Lopez"));
    }
}
