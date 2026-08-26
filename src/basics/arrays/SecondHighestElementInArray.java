package basics.arrays;

import java.util.Arrays;

public class SecondHighestElementInArray {

    public static void main(String[] args) {

        int[] arr = {3,4,6,8,2,7,9,11};

        int secondHighest = findSecondHighest(arr);

        System.out.println("SECOND HIGHEST ELE IN ARR: "+ Arrays.toString(arr)+" is : "+secondHighest);

    }

    private static int findSecondHighest(int[] arr) {

        int highest = Integer.MIN_VALUE;
        int sec_highest = Integer.MIN_VALUE;

        for(int num : arr){
            if (num>highest){
                sec_highest = highest;
                highest = num;
            } else if (num<highest && num>sec_highest) {
                sec_highest = num;
            }
        }

        return sec_highest;

    }


}
