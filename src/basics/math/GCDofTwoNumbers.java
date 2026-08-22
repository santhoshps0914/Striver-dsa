package basics.math;

public class GCDofTwoNumbers {

    public static void main(String[] args) {

        int num1 = 36;
        int num2 = 60;

        int gcd = findGcd(num1,num2);
        System.out.println("GCD of two numbers: "+num1+" & "+num2+" is: "+gcd);

    }

    private static int findGcd(int num1, int num2) {

        if (num2==0) return num1;
        else return findGcd(num2,num1%num2);

    }


}
