package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectErase510202022 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10));
        System.out.println(list);
        list.removeAll(Arrays.asList(5));
        System.out.println(list);
    }
}
