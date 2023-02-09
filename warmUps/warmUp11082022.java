package warmUps;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp11082022 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","pear","dragonfruit","tomato"));
        int max = fruits.get(0).length();
        for(int i = 1; i<fruits.size() ; i++){
            if(max<fruits.get(i).length()){
                max=fruits.get(i).length();
            }
        }
        System.out.println(max);
        System.out.println();
    }
}
