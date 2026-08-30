package basics.stringops;

public class LargestOddNumberInAString {

    public static void main(String[] args) {

        String num = "0032579";

        String largestOddNum = findLargestOddNumber(num);

        System.out.println("Largest odd num is : "+largestOddNum);

    }

    private static String findLargestOddNumber(String str) {

        if (str.isBlank() || str.isEmpty()) return "";

        str = str.replaceFirst("^0+","");

        for (int i= str.length()-1; i>=0; i--){
            int num = str.charAt(i) - '0';

            if (num%2!=0){
                return str.substring(0,i+1);
            }

        }
        return "";
    }

}
