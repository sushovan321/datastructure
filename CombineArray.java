import java.util.*;

public class CombineArray {


    public static void main(String[] args){

        System.out.println("Combine two sorted array using two pointer approach:");
        int[] inputOne = {1,4,7,8,12,15};
        int[] inputTwo = {12, 15, 17, 18,22};
        CombineArray(inputOne, inputTwo);

    }


    public static void CombineArray(int [] inputOne, int[] inputTwo){

        int i = 0;
        int j = 0;
        List<Integer> numList = new ArrayList<Integer>(inputOne.length+inputTwo.length);

        while(i < inputOne.length && j <inputTwo.length){
            //if one[element] < two[element]
            //insert one first

            if(inputOne[i] < inputTwo[j]){

                    numList.add(inputOne[i]);
                    i++;

            }else {
                 numList.add(inputTwo[j]);
                    j++;

            }

        }

        while(i < inputOne.length){
               numList.add(inputOne[i]);
               i++;

        }
 while(j < inputTwo.length){
               numList.add(inputTwo[j]);
               j++;

        }
        System.out.println("Combined : "+numList);

    }
    
}
