package advanced.fundamentals;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {3,22,45,66,444,746,345,565};

        int secondLargest = findSecondLargest(arr);

        System.out.println("SecondLargest ele in array "+ Arrays.toString(arr)+" is: "+secondLargest);

    }

    private static int findSecondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            return -1;
        }

        if (arr.length == 2) {
            return Math.min(arr[0], arr[1]);
        }

        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if (num>largest){
                secondLargest = largest;
                largest = num;
            }else if (num<largest && num>secondLargest){
                secondLargest = num;
            }
        }

        return secondLargest;

    }

}
