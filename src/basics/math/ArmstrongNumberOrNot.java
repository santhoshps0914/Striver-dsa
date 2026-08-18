package basics.math;

public class ArmstrongNumberOrNot {

    public static void main(String[] args) {

        int number = 370;

        boolean isArmstrong = isNumberArmstrong(number);

        System.out.println("Given number "+number+" is armstrong: "+isArmstrong);

    }

    private static boolean isNumberArmstrong(int number) {

        if (number<0) throw new IllegalArgumentException("Number should be greater than 0");

        if (number==0) return true;

        int n = number, sum = 0;

        int digitcount = String.valueOf(n).length();

        while (n!=0){
            int rem = n%10;
            sum+= (int) Math.pow(rem,digitcount);
            n/=10;
        }

        return sum==number;

    }
}
