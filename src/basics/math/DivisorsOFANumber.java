package basics.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisorsOFANumber {

    public static void main(String[] args) {

        int number = 14;

        int[] divisors = findDivisorOfNumber(number);

        System.out.println("divisor of number: "+number+" is: "+ Arrays.toString(divisors));

    }

    private static int[] findDivisorOfNumber(int number) {

        if (number==0) return new int[]{0};
        List<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i<=number; i++){
            if (number%i==0) divisorList.add(i);
        }

        return divisorList.stream().mapToInt(Integer::intValue).toArray();

    }


}
