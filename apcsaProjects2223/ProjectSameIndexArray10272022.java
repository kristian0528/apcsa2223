package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectSameIndexArray10272022 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i = 0; i<numbers.length; i++){
            numbers[i]=i;
        }
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i<numbers.length; i++)
        {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
