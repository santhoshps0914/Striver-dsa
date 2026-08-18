package basics.math;

public class FactorialOfANumber {

    public static void main(String[] args) {

        int number = 5;

        System.out.println(iterativeApproach(number));
        System.out.println(recursiveApproach(number));

    }

    private static int recursiveApproach(int number) {

        if (number==0) return 1;

        return number*recursiveApproach(number-1);


    }

    private static int iterativeApproach(int number) {

        if (number == 0) return 1;

        int fact = 1;

        for (int i = 1; i<=number; i++){
            fact=fact*i;
        }

        return fact;
    }

}
