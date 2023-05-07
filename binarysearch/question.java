package com.binarysearch;

public class question {
    public static void main(String[] args) {
        int n = 16;

        boolean ans = square(n);
        System.out.println(ans);

    }

    static boolean square(int nums ){
        int i = 1;
        while (nums > 0) {
            nums -=i;
            i+=2;
        }

        return nums == 0 ;
    }
}
