package basics.math;

public class CountDigitsOfANumber {

    public static void main(String[] args) {

        int number = 36353;

        System.out.println(countDigits(number));

    }

    private static int countDigits(int number) {

        int count = 0;
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }

}
