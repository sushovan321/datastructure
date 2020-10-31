package com.sadprogramming.ds.array;

public class SortedSquare {

    public static int[] sortedSquare(int[] nums) {
      int negativeIndex =-1;
        for (int i=0; i< nums.length;i++) {
            if (nums[i] >= 0 && negativeIndex ==-1 ) {
                negativeIndex = i-1;
            }
            nums[i] = nums[i]*nums[i];


        }
        return mergeAndSort(nums, negativeIndex);

    }

    private static int[] mergeAndSort(int[] nums, int negativeIndex) {
        if(negativeIndex >=0){
            for (int i=0; i<= negativeIndex;i++){
                   if(nums[i] > nums[i+negativeIndex+1]){
                       swap(nums, i+negativeIndex+1, i);
                       int indexToSwap = findMinmIndex(nums,i+negativeIndex+1);
                       if(indexToSwap !=-1){
                           swap(nums,indexToSwap,i+negativeIndex+1);
                       }
                   }
               }


        }

        return nums;
    }

    private static void swap(int[] nums, int toIndex, int fromIndex) {
        int temp = nums[fromIndex];
        nums[fromIndex] = nums[toIndex];
        nums[toIndex] = temp;
    }

    private static int findMinmIndex(int[] nums, int startIndex) {
        int minIndex =startIndex;
        int index =startIndex+1;
        while(index < nums.length){
            if(nums[startIndex] > nums[index]){
                minIndex = index;
            }
            index ++;
        }
        return  minIndex;
    }
}