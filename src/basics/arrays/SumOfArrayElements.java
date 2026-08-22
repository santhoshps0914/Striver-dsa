package basics.arrays;

import java.util.Arrays;

public class SumOfArrayElements {

    public static void main(String[] args) {

        int[] numbers = {1,2,1,1,5,1};

        int sum = findSumOfArrayElements(numbers);

        System.out.println("Sum of Array Elements : "+ Arrays.toString(numbers)+" is : "+sum);

        System.out.println("Sum of Array Elements : "+ Arrays.toString(numbers)+" is : "+findSumOfArrayElementsByStream(numbers));

    }

    private static int findSumOfArrayElements(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static int findSumOfArrayElementsByStream(int[] numbers){

        return Arrays.stream(numbers).sum();


    }
}
