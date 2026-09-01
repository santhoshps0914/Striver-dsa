package advanced.arrays_fundamentals;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {4,8,1,6,9,11,25,63,3,23};
        int ele = 25;
        int pos = findElementLinearSearch(arr,ele);

        if (pos==-1)
            System.out.println("element "+ele+" not found");
        else
            System.out.println("element "+ele+" is found at position "+pos);


    }

    private static int findElementLinearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== target) return i;
        }
        return -1;

    }

}
