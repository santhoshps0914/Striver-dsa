package basics.math;

public class PrimeNumberOrNot {

    public static void main(String[] args) {

        int number = 7;

        boolean isPrime = isNumberPrime(number);

        System.out.println("Is number prime ? "+number+" : "+isPrime);

    }

    private static boolean isNumberPrime(int number) {

        for (int i = 2 ; i <= Math.sqrt(number);i++){
            if (number%i==0) return false;
        }

        return true;

    }

}
