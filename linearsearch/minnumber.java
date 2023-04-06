package com.linearsearch;

public class minnumber {
    public static void main(String[] args) {
        int[] num = {12, 4, 56, 6,45,2};
        int answer = min(num);
        System.out.println(answer);

    }
    // assume arr.length !=0
    // return the min value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(ans>arr[i]) ans= arr[i];



        }
        return ans;

    }
}
