package apcsaProjects2223;

import java.util.Arrays;

public class ProjectCombinedArrays10182022 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = new int[arr.length+arr2.length];
        for(int i = 0; i<arr.length ; i++){
            arr3[i]=arr[i];
        }
        for(int i = arr.length, a=0 ; i<arr.length+arr2.length; i++,a++){
            arr3[i]=arr2[a];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
