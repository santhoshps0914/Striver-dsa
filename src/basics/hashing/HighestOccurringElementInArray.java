package basics.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElementInArray {

    public static void main(String[] args) {

       // int[] arr = {3,4,5,3,2,4,5,3,2,2,3,1,3};
        int[] arr = {3,3,2,2,5,8,9,7};

        int occuredElement = findHighestOccurrence(arr);

        System.out.println("most frequency ele in arr :"+ Arrays.toString(arr) +" is : "+occuredElement);


    }

    private static int findHighestOccurrence(int[] arr) {

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        //1: add elements to map with count

        for (int ele : arr){
            freqMap.put(ele,freqMap.getOrDefault(ele,0)+1);
        }

        System.out.println(freqMap);

        //2: find freq and repeated element

        int MAX_FREQ = 0;
        int VAL = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){

            int ele = entry.getKey();
            int freq = entry.getValue();

            // stored as {ele=freq}

            //MAX_FREQ and VAL gets updated when
            //freq > MAX_FREQ
            //or
            // if MAX_FREQ is equal to freq then we are taking least element
            //ex: {2=3,4=3} {2=3} is preferred

            if (freq> MAX_FREQ || (MAX_FREQ ==freq && ele< VAL)){
                MAX_FREQ = freq;
                VAL = ele;
            }
        }
        return VAL;

    }


}
