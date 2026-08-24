package basics.arrays;

import java.util.Arrays;

public class CountOddNoInArray {

    public static void main(String[] args) {

        int[] arr = {1,3,8,7,9,6,4,2,13,45,44};

        int count = countOddElementsInArray(arr);

        System.out.println("no of odd elements in Array is: "+count);
        System.out.println("no of odd elements in Array is: "+countOddElementsInArrayByStreams(arr));

    }

    private static int countOddElementsInArray(int[] arr) {
        int count = 0;
        for (int num : arr){
            if (num%2!=0) count++;
        }
        return count;
    }

    private static int countOddElementsInArrayByStreams(int[] arr){

        return (int) Arrays.stream(arr).filter(n -> n % 2 != 0).count();

    }


}
