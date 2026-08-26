package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class SumOFHighestAndLowestFreq {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3};
      //  int[] arr = {10, 9, 7, 7, 8, 8, 8};

        //expected ans: 4 : HIGH_FREQ = 3 = 3 times + LOW_FREQ = 1 = 1 times so 3+1 = 4
        // Here we are adding frequency not value

        int freq = findSumOfFrequencies(arr);

        System.out.println("sum of freq : "+freq);
    }

    private static int findSumOfFrequencies(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           int freq = entry.getValue();

           if (freq> maxFreq){
               maxFreq = freq;
           }
           if (freq< minFreq){
               minFreq = freq;
           }
        }
        return maxFreq + minFreq;
    }

}
/* NOTE: */
//TBA :/*Sum of highest and lowest freq element will be added later*/
