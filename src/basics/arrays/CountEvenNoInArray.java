package basics.arrays;

import java.util.Arrays;

public class CountEvenNoInArray {

    public static void main(String[] args) {
        int[] arr = {1,3,8,7,9,6,4,2,13,45,44,56};

        int count = countEvenElementsInArray(arr);

        System.out.println("no of odd elements in Array is: "+count);
        System.out.println("no of odd elements in Array is: "+countEvenElementsInArrayByStreams(arr));
    }

    private static int countEvenElementsInArrayByStreams(int[] arr) {
      return (int) Arrays.stream(arr).filter(n->n%2==0).count();
    }

    private static int countEvenElementsInArray(int[] arr) {

        int count = 0;

        for (int num : arr){
            if (num%2==0) count++;
        }

        return count;
    }

}
