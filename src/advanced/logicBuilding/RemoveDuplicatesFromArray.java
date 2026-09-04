package advanced.logicBuilding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = {-2, 2, 4, 4, 4, 4, 5, 5};

        int uniqueElementsCountBySet = removeDuplicateBySetElements(arr);

        System.out.println("uniqueElementsCountBySet is : "+uniqueElementsCountBySet);

    }

    private static int removeDuplicateBySetElements(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

       for(int ele : arr){
           set.add(ele);
       }

       int k = set.size();

       int j = 0;

       for(int val: set){
           arr[j++] = val;
       }


        System.out.println(Arrays.toString(arr));

       return k;

    }

    private static int removeDuplicateElements(int[] arr) {

       return (int) Arrays.stream(arr).distinct().count();


    }

}
