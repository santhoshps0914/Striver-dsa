package basics.stringops;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        String str =  "tree";

        List<Character> sortedCharacters = frequencySort(str);

        System.out.println(sortedCharacters);


    }

    private static List<Character> frequencySort(String str) {

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }



        return map.keySet().stream().sorted((a, b) -> {
            int freq = map.get(b) - map.get(a);

            if (freq != 0) return freq;

            return Character.compare(a, b);

        }).collect(Collectors.toList());


    }


}

/*
*
**  Time Complexity
* O(n log n) where n is the length of the string,
* due to iterating over n characters to populate
* the map and sorting up to n unique keys which takes O(k log k) where k <= n.
*
* O(n) where n is the length of the string,
* required to store the frequency map containing up to n unique characters.
*
* */