package basics.stringops;

public class RotateString {

    public static void main(String[] args) {

        String str = "abcde";
        String goal  = "cdeab";

        boolean isStringRotate = rotateString(str,goal);

        System.out.println("is string rotatable : "+isStringRotate);


    }

    private static boolean rotateString(String str, String goal) {

        String temp = str + str;

        return temp.contains(goal);

    }


}
