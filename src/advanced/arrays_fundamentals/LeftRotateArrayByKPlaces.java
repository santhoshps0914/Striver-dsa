package advanced.arrays_fundamentals;

import java.util.Arrays;

public class LeftRotateArrayByKPlaces {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int k = 2;

        System.out.println("before rotation : "+ Arrays.toString(arr));

        leftRotateByKPlace(arr,k);

        System.out.println("after rotation by k="+k+" place: "+Arrays.toString(arr));

    }

    private static void leftRotateByKPlace(int[] arr, int k) {
        k%=arr.length;

        rotateLeft(0,k-1,arr);
        rotateLeft(k, arr.length-1, arr);
        rotateLeft(0, arr.length-1, arr);

    }

    private static void rotateLeft(int left, int right, int[] arr){

        while (left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

    }

}
