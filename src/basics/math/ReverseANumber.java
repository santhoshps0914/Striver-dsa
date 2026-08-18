package basics.math;

public class ReverseANumber {

    public static void main(String[] args) {

        int num = 12345;

        System.out.println(reverseNumber(num));


    }

    private static int reverseNumber(int number){

        int reverse = 0;
        int rem;

        while (number>0){
            rem = number%10;

            reverse = (reverse * 10) + rem;

            number/=10;
        }

        return reverse;

    }


}
