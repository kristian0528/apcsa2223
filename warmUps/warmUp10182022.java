package warmUps;

import java.util.ArrayList;
import java.util.Comparator;

public class warmUp10182022 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Kristian");
        arrList.add("Alejandro");
        arrList.add("Nathaniel");
        arrList.add("Trent");
        arrList.add("Muammer");
        arrList.add("Christopher");
        arrList.add("Ethan");
        arrList.add("Sebastian");

        System.out.println(arrList);
        arrList.sort(Comparator.naturalOrder());
        System.out.println(arrList);
    }
}
