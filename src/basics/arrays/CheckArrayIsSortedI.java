package basics.arrays;

import java.util.Arrays;

public class CheckArrayIsSortedI {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int[] arr2 = {1,6,4,4,5};
        System.out.println(Arrays.toString(arr)+" is sorted : "+checkArraySorted(arr));
        System.out.println(Arrays.toString(arr2)+" is sorted : "+checkArraySorted(arr2));

    }

    private static boolean checkArraySorted(int[] arr) {
        for (int i = 1; i<arr.length; i++){
            if (arr[i-1]>arr[i]) return false;
        }
        return true;
    }

}
