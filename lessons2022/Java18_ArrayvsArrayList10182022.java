package lessons2022;

import java.util.ArrayList;

public class Java18_ArrayvsArrayList10182022 {
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
                   Arrays                                        ArrayList
                   -array size fixed                             -size is dynamic
                   -supports only prim                           -supports only objects
                   -array can be multidimensional                -is ordered in collection
                                                                 -you can add/remove with methods
                                                                 -doesn't skip index
                                                                 -not multidimensional
 */
        //manually turn the following array to arrayList
        int[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(arr[0]);
        arr2.add(arr[1]);
        arr2.add(arr[2]);
        arr2.add(arr[3]);
        arr2.add(arr[4]);
        arr2.add(arr[5]);
        arr2.add(arr[6]);
        arr2.add(arr[7]);
        arr2.add(arr[8]);
        System.out.println(arr2);
    }
}
