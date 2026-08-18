package basics.math;

public class CountNoOfEvenDigits {

    public static void main(String[] args) {

        int number = 36358421;

        System.out.println(countEvenDigits(number));

    }

    private static int countEvenDigits(int number) {

        int count = 0;
        int rem;
        while (number>0){
            rem = number%10;
            if (rem%2==0) count++;
            number= number/10;
        }
        return count;
    }


}
