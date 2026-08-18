package basics.math;

public class LargestDigitInANumber {

    public static void main(String[] args) {

        int number = 527361;

        System.out.println(findLargestDigitInANumber(number));

    }

    private static int findLargestDigitInANumber(int number) {

        int largest = 0;
        int rem  = 0;
        while (number>0){

            rem = number%10;

            if (rem>largest){
                largest=rem;
            }

            number/=10;

        }
            return largest;
    }

}
