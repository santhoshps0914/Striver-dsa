package basics.stringops;

public class PalindromeCheck {

    public static void main(String[] args) {

        String str = "malayalam";

        boolean isPalindrome = isStringPalindrome(str);

        System.out.println("is string: "+str+" is palindrome: "+isPalindrome);
    }

    private static boolean isStringPalindrome(String str) {

        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if (str.charAt(left++)!=str.charAt(right--)) return false;
        }

        return true;

    }

}
