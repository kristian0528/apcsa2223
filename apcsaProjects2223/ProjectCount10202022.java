package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectCount10202022 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10));
        System.out.println(list);

        int counter = 0;
        for(int i = 0 ; i<list.size();i++){
            if(list.get(i)==5){
                counter++;
            }
        }
        System.out.println("This much 5's are there "+counter);
    }
}
