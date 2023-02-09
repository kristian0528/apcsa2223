package warmUps;

import java.util.ArrayList;

public class warmUp01102023 {
    public static ArrayList<Integer> uniqueListMethod(ArrayList<Integer> myList){
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(int i = 0; i<myList.size(); i++)
        {
            if(!uniqueList.contains(myList.get(i))){
                uniqueList.add(myList.get(i));
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
    }
}
