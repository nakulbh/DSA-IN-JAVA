package com.linearsearch;

public class search_element_itself {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int ans = linearsearch(num, target);
        System.out.println(ans);

    }


    static int linearsearch(int[] arr, int target) {
        for (int element : arr) {
            if (element == target)//for every element in the array
            {
                return element;
            }
        }
        return -1;



    }


}
