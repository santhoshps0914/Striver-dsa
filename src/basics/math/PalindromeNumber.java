package basics.math;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 1221122;

        System.out.println(checkPalindrome(number));


    }

    private static boolean checkPalindrome(int number) {

        int copy = number;
        int rev = 0;

        while (number!=0){
           rev=rev*10 + (number%10);

           number/=10;
        }

        return rev==copy;

    }


}
