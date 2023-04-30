package com.binarysearch;

import java.util.HashSet;

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        int[] intersection = new int[set1.size()];
        int i = 0;

        for (int num : set1) {
            intersection[i++] = num;
        }

        return Arrays.copyOf(intersection, intersection.length);
    }


    /////second method but takes more time to run then above

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            ArrayList<Integer> intersection = new ArrayList<Integer>();
            for(int i : nums1) {
                for(int j : nums2) {
                    if(i == j && !intersection.contains(i)) {
                        intersection.add(i);
                    }
                }
            }
            return intersection.stream().mapToInt(Integer::intValue).toArray();
        }

        //The condition !intersection.contains(i) is used to ensure that the same value is not added to the intersection list more than once.
        //
        //In the first iteration of the loop, the intersection list will be empty, so !intersection.contains(i) will evaluate to true regardless of the value of i.
        //
        //As more values are added to the intersection list, the contains() method will be used to check if the list already contains the value being considered. If the value is already in the list, it will not be added again.
        //
        //This is a useful check to prevent duplicates in the intersection list.
    }

}