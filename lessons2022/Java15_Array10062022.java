package lessons2022;

import java.util.Arrays;

public class Java15_Array10062022 {
    public static void main(String[] args) {
        //arrays store more than one primitive variable but in some time
        //array class is presented in java.utiils
        //array size must be initialized
        //default value of string is null int is a boolean is false char is space

        int[] arr = {111,222,333,444}; //decleration of an int
        String[] arr2 = {"nathaniel","Alejandro","Kristian","Chris","Trent"}; //decleration of s string
        char[] arr3 = new char[4];  //4 is the size of the array

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        //assigning a value
        arr[0]=456;
        System.out.println(arr[0]);

        //printing each value of an array
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //Array methods

        //Array length
        System.out.println(arr.length);//this is going to give number of elements

        //Sort method
        Arrays.sort(arr); //this will order ascending or alphabetical order
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //Binary search
        Arrays.binarySearch(arr,444);
        System.out.println(Arrays.binarySearch(arr2,"Nathaniel"));

        //Split method
        String stNames = "nathaniel alex kristian chris";
        String[] stt = stNames.split(" ");
        System.out.println(Arrays.toString(stt));
        for(int i = 0 ; i<stt.length;i++){
            System.out.println(stt[i]);
        }

        //To char array
        String ssttrr = "Java is the most common programming language around the earth";
        System.out.println(Arrays.toString(ssttrr.toCharArray()));
    }
}
