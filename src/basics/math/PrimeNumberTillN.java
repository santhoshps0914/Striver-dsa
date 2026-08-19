package basics.math;

public class PrimeNumberTillN {

    public static void main(String[] args) {

        int limit = 50;

        findPrimesUntilLimit(limit);

    }

    private static void findPrimesUntilLimit(int limit) {

        System.out.print("1 ");
        for (int i=2; i<=limit; i++){
            if(isPrimeNumber(i)) System.out.print(i+" ");
        }
    }

    private static boolean isPrimeNumber(int number) {

        for (int i = 2; i<=Math.sqrt(number);i++){
            if (number%i==0) return false;
        }
        return true;
    }


}
