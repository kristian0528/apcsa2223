package apcsaProjects2223;

import java.util.Arrays;

public class ProjectReverseTheArray10272022 {
    public static void main(String[] args) {
        String[] str = {"Trent","Kristian","Alejandro","Nathaniel","Christopher"};
        String[] reverse = new String[str.length];
        for(int i = 0; i<str.length;i++){
            reverse[i]=str[str.length-1-i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
