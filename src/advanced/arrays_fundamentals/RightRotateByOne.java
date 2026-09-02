package advanced.arrays_fundamentals;

import java.util.Arrays;

public class RightRotateByOne {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rotateArrayRightByOne(arr);

        System.out.println("After Right rotation by one: "+ Arrays.toString(arr));


    }

    private static void rotateArrayRightByOne(int[] arr) {

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
        }


    }


}
