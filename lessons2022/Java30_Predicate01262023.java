package lessons2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Java30_Predicate01262023 {
    //predicate does the job an if statement does but in one line

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        Predicate<Integer> oddNumber = p -> p%2==1;
        arr.removeIf(oddNumber);
        System.out.println(arr);

        ArrayList<String> stuList = new ArrayList<>(Arrays.asList("Kristian","Alex","Nathaniel"));
        Predicate<String> name = p -> p.equals("Kristian") || p.equals("Alex");
        stuList.removeIf(name);
        System.out.println(stuList);

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("*","%","&","8"));
        Predicate<String> num = p -> p.equals("8");
        stuList.removeIf(num);
        System.out.println(strList);
    }
}
