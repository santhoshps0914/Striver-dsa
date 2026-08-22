package basics.math;

public class LCMofTwoNumbers {

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;

        int lcm = findLcm(n1,n2);
        System.out.println("LCM of Two numbers: "+n1+" & "+n2+" is: "+lcm);
    }

    private static int findLcm(int n1, int n2) {
        return (n1*n2)/gcd(n1,n2);
    }
    private static int gcd(int n1, int n2) {
        if (n2==0) return n1;
        else return gcd(n2,n1%n2);

    }

}
