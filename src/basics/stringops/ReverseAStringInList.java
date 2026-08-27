package basics.stringops;

import java.util.ArrayList;
import java.util.List;

public class ReverseAStringInList {

    public static void main(String[] args) {

        String str = "hello";

        List<Character> charlist = new ArrayList<>();

        for (char ch : str.toCharArray()){
            charlist.add(ch);
        }

        System.out.println("before reversing: "+charlist);

       reverseAString(charlist);

        System.out.println("after reversing: "+charlist);

    }

    private static void reverseAString(List<Character> charlist) {

        int left = 0;
        int right = charlist.size()-1;

        while (left<right){
            char temp = charlist.get(left);
            charlist.set(left,charlist.get(right));
            charlist.set(right,temp);
            left++;
            right--;
        }
    }
}
