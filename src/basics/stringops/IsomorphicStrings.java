package basics.stringops;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

        String str1 = "foo";
        String str2 = "bar";

        System.out.println("is two strings isomorphic: "+isStringsIsomorphicMap(str1,str2));
        System.out.println("is two strings isomorphic: "+isStringIsomorphicArray(str1,str2));


    }

    private static boolean isStringsIsomorphicMap(String str1, String str2) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();

        for (int i = 0 ; i<str1.length(); i++){
            if (!hashMap.containsKey(str1.charAt(i))){
                hashMap.put(str1.charAt(i),i);
            }

            if (!hashMap2.containsKey(str2.charAt(i))){
                hashMap2.put(str2.charAt(i),i);
            }

            if (!hashMap.get(str1.charAt(i)).equals(hashMap2.get(str2.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    private static boolean isStringIsomorphicArray(String s, String t){

        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for (int i = 0; i < s.length(); i++){

            if (m1[s.charAt(i)]!=m2[t.charAt(i)]) return false;

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
