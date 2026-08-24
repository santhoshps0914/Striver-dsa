package basics.arrays;

import java.util.Arrays;

public class ReverseAnArrayElements {

    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,9,8,7};
        System.out.println("Before reverse: "+ Arrays.toString(arr));
        reverse(arr);
    }

    public static void reverse(int[] arr){
        //[Two pointer approach]//
        int start = 0, end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("After reverse: "+Arrays.toString(arr));
    }
}
