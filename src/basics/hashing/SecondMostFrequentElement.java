package basics.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentElement {

    public static void main(String[] args) {

        int[] arr = {4, 4, 5, 5, 6, 7};

        int secondMostFreq = findSecondMostFreq(arr);

        System.out.println("second most freq of arr: "+ Arrays.toString(arr)+" is : "+secondMostFreq);

    }

    private static int findSecondMostFreq(int[] arr) {

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for (int ele : arr){
            freqMap.put(ele,freqMap.getOrDefault(ele,0)+1);
        }

        int SECOND_MAX_FREQ = getSecondMaxFreq(freqMap);

        if (SECOND_MAX_FREQ==0) return -1;

        int SECOND_MAX_FREQ_ELE = Integer.MAX_VALUE;

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){

            int val = entry.getKey();
            int frequency = entry.getValue();

            if (SECOND_MAX_FREQ==frequency){
                SECOND_MAX_FREQ_ELE = Math.min(val,SECOND_MAX_FREQ_ELE);
            }
        }

        return  SECOND_MAX_FREQ_ELE;
    }

    private static int getSecondMaxFreq(HashMap<Integer, Integer> freqMap) {
        int FIRST_MAX_FREQ = 0;
        int SECOND_MAX_FREQ = 0;

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){

            int freq = entry.getValue();

            if (freq>FIRST_MAX_FREQ){
                SECOND_MAX_FREQ = FIRST_MAX_FREQ;
                FIRST_MAX_FREQ = freq;
            }else if (freq<FIRST_MAX_FREQ && freq>SECOND_MAX_FREQ){ //less than highest greater than sec_highest
                SECOND_MAX_FREQ = freq;
            }
        }
        return SECOND_MAX_FREQ;
    }

}
