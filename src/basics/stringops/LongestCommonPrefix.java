package basics.stringops;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] words = {"flowers","flow","fly","flight"};


        System.out.println("Longest common prefix is: "+findCommonPrefix(words));

    }

    private static String findCommonPrefix(String[] words) {

        Arrays.sort(words);

        StringBuilder builder = new StringBuilder();

        System.out.println(Arrays.toString(words));

        char[] firstword = words[0].toCharArray();

        char[] lastword = words[words.length-1].toCharArray();

        System.out.println("firstword: "+Arrays.toString(firstword));
        System.out.println("lastword: "+Arrays.toString(lastword));

        for (int i = 0; i< firstword.length; i++){
            if (firstword[i]!=lastword[i]) break;
            builder.append(firstword[i]);
        }

        return builder.toString();

    }

}
/*
*    [Revision]
*   1) Sort String arrays
*   2) take firstword and lastword and convert it that to character array
*   3) for i to n in firstword
*          if firstword[i] != lastword[i] then break;
*       use string builder to append the characters which are matching
*   4) return builder.toString();
* */