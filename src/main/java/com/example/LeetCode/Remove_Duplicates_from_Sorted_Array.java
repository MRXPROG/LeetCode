package com.example.LeetCode;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    public int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return new int[0];
        }
        int write = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]){
                nums[write] = nums[i];
                write++;
            }
        }
        for(int i = write; i < nums.length; i++){
            nums[i] = '_';
        }
        System.out.println(Arrays.toString(nums));

        return nums;
    }
}
