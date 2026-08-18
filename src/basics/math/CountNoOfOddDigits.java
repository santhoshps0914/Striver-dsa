package basics.math;

public class CountNoOfOddDigits {

    public static void main(String[] args) {

        int number = 3635321;

        System.out.println(countOddDigits(number));

    }

    private static int countOddDigits(int number) {

        int count = 0;
        int rem = 0;
        while (number>0){
            rem = number%10;
            if (rem%2!=0) count++;
            number/=10;
        }
        return count;

    }

}
