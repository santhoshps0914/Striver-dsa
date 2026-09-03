package advanced.logicBuilding;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 1, 4};

        int missingNumber = findMissingNUmber(arr);

        System.out.println("Missing number is : "+missingNumber);

    }

    private static int findMissingNUmber(int[] arr) {
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }

        int n = arr.length;
        int exponentialSum = n*(n+1)/2;

        return exponentialSum - sum;
    }


}
