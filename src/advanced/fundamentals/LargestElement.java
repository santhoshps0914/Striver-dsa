package advanced.fundamentals;

import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {3,22,45,66,444,746,345,565};

        int largest = findLargest(arr);

        System.out.println("Largest ele in array"+ Arrays.toString(arr)+" is: "+largest);


    }

    private static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int j : arr) {
            if (j > largest) largest = j;
        }

        return largest;
    }

}
