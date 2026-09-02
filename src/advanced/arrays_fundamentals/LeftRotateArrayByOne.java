package advanced.arrays_fundamentals;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rotateArrayLeftByOne(arr);

        System.out.println("After left rotation by one : "+ Arrays.toString(arr));
        //After rotation: [2, 3, 4, 5, 1]

    }

    private static void rotateArrayLeftByOne(int[] arr) {

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
        }
    }

}
