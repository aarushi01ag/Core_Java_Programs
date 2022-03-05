package interview.programs.array;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElementsInArray {

        public static void main(String[] args) {
            int count = 1;
            int arr[] = new int[]{1, 3, 1, 5, 1, 3, 4, 5};

            HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();

            for (int i = 0; i < arr.length; i++) {

                //System.out.println(output.get(arr[i]));

                if (output.get(arr[i]) == null) {
                    output.put(arr[i], 1);
                    //System.out.println(output.get(arr[i]));
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            output.replace(arr[i], output.get(arr[i]) + 1);
                        }

                    }

                }
            }
            System.out.println("Element  |  Frequency");

            for(Map.Entry entry: output.entrySet()){
                System.out.println(entry.getKey() + " | " +entry.getValue());
            }
           //for(int i =0;i<arr.length;i++){
                //System.out.println( " "+arr[i]+ " | " +output.get(arr[i]) );
            }

        }





