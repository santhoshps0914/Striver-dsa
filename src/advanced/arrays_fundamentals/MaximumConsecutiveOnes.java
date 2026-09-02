package advanced.arrays_fundamentals;

import java.util.Arrays;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 1, 1, 1, 0};

        int countConsecutiveOnes = findConsecutiveOnes(arr);

        System.out.println("Consecutive ones in this array: "+ Arrays.toString(arr)+" is : "+countConsecutiveOnes);


    }

    private static int findConsecutiveOnes(int[] arr) {

        int count = 0;
        int consecutiveCount = 0;

        for(int num : arr){
            if (num==1){
                count++;
                consecutiveCount = Math.max(consecutiveCount,count);
            }else count = 0;
        }

        return consecutiveCount;
    }


}
