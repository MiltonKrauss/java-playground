package org.example;

public class MakeMiddle {
    /* Create an integer array method called MakeMiddle that takes in an integer array “nums”. Given an array of ints of
     even length, return a new array length 2 containing the middle two elements from the original array. The original
     array will be length 2 or more.
    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2] */
    public static int[] makeMiddle (int[] nums) {
        int middleIndex = nums.length / 2;
        int[] middleNums = {nums[middleIndex - 1], nums[middleIndex]};
        return middleNums;
    }
}
