package warmUps;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp10202022 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        list.add(44);
        list.add(55);
        list.add(66);

        int sum = 0;
        for(int i = 0; i<list.size(); i++){
            sum+=list.get(i);
        }
        System.out.println(sum/list.size());
    }
}
