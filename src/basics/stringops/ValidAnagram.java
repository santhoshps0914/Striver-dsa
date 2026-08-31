package basics.stringops;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean isValidAnagram = checkForAnagram(s,t);

        System.out.println("is strings : "+s+" && "+t+" is anagram: "+isValidAnagram);


    }

    private static boolean checkForAnagram(String s, String t) {

        HashMap<Character,Integer> hmap = new HashMap<>();

        for (char c: s.toCharArray()){  //string s every character count ++
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }

        for (char c: t.toCharArray()){ //string t every character count --
            hmap.put(c,hmap.getOrDefault(c,0)-1);
        }

        for (Integer count: hmap.values()){
            if (count!=0) return false;
        }

        return true;
    }

}
