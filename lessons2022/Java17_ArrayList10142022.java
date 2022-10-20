package lessons2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Java17_ArrayList10142022 {
    public static void main(String[] args) {
        //Array list
        //presented in java util class
        //is an ordered collection of values
        //ArrayList is dynamic size arrays, do not have to specify
        //Can add and remove arrays from ArrayList
        //Only stores objects

        //Decleration
        ArrayList<String> arrList = new ArrayList<>();
        //or
        ArrayList<String> arrList2 = new ArrayList<String>();
        //or
        ArrayList<Integer> list10 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        //Adding array
        arrList.add("Kristian");
        arrList.add("Alejandro");
        arrList.add("Nathaniel");
        System.out.println(arrList);

        //Get
        System.out.println(arrList.get(1));

        //Size
        System.out.println(arrList.size());

        //Clear removes all values
        arrList.clear();
        System.out.println(arrList);

        //Set
        arrList.add(0,"Trent");
        System.out.println(arrList);
        arrList.set(0,"Kristian");
        System.out.println(arrList);

        //Contains
        System.out.println(arrList.contains("Trent"));
        System.out.println(arrList.contains("Kristian"));

        //equals method - check if two arrays are the same
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println(arr1.equals(arr2));// this will be true
        System.out.println(arrList.equals(arr2)); //this will be false

        //Remove method
        System.out.println(arr1);
        arr1.remove("b");
        System.out.println(arr1);

        //Index of method
        System.out.println(arr2.indexOf("c"));
        System.out.println(arr1.indexOf("c"));

        //Last Index of
        arr2.add("4");
        arr2.add("5");
        arr2.add("6");
        arr2.add("a");
        System.out.println(arr2.lastIndexOf("a"));
        System.out.println(arr2.indexOf("a"));

        //Empty checks if the list is empty
        System.out.println(arr2.isEmpty());
        arr2.clear();
        System.out.println(arr2.isEmpty());

        //Add all method
        ArrayList<String> listA1 = new ArrayList<>();
        listA1.add("first and only value");
        String[] arrToA1 = {"This contains","several", "values"};
        listA1.addAll(Arrays.asList(arrToA1));
        listA1.add("after adding a list of items");
        System.out.println(listA1);

        // Remove all method
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.remove(1);
        numbers.removeAll(Arrays.asList(1));
        System.out.println("numbers");

    }
}
