package advanced.logicBuilding;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 4, 0, 5, 2};

        moveZeroesToEnd(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void moveZeroesToEnd(int[] arr) {

      int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

    }

}
