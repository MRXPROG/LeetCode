package com.example.LeetCode;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] newNums = new int[0];
        for (int i = 0; i < nums.length; i++) {
            if (newNums.length > 0) {
                break;
            }
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    newNums = new int[]{nums[i], nums[j]};
                    break;
                }
            }
        }

        return newNums;
    }


}
