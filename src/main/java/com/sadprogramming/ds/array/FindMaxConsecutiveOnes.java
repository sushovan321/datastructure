package com.sadprogramming.ds.array;


/*
Given a binary array, find the maximum number of consecutive appearance of a particular no  in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 */
public class FindMaxConsecutiveOnes {


    public static int find(int[] nums, int number) {
        int frequency = 0;
        int matchedIndex = 0;
        int previousHighestFrequency = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                if (i - matchedIndex <= 1) {
                    frequency++;
                } else {
                    previousHighestFrequency =
                        Math.max(previousHighestFrequency, frequency);
                    frequency = 1;
                }
                matchedIndex = i;

            }
        }

        return Math.max(frequency, previousHighestFrequency);

    }
}
