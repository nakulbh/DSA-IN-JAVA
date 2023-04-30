package com.binarysearch;

import java.util.Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] nums = {4,0,1,2};
        int ans = missingNumber(nums);
        System.out.println(Integer.toString(ans));

    }

    static int missingNumber(int[] nums) {

        int sum = nums.length*(nums.length + 1) / 2;

        for (int i : nums) {
            sum -= i;
        }

        return sum;
    }
}
