package warmUps;

import java.util.ArrayList;

public class warmUp11032022 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Kris");
        list.add("Nathaniel");
        list.add("Ethan");
        list.add("Trent");
        list.add("Chris");

        System.out.println(list);

        if(list.contains("Ahmet")){
            System.out.println("Yes it contains Ahmet");
        }
        else{
            System.out.println("It does not contain ahmet");
        }

    }
}
