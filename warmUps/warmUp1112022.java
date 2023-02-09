package warmUps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmUp1112022 {
    public static void main(String[] args) {
        String[] str = {"Trent","Kristian","Nathaniel","Alejandro"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

        Collections.sort(list);

        System.out.println(Arrays.toString(str));
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
