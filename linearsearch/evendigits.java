package com.linearsearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class evendigits {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        System.out.println(findnumber(num));

    }
     static int findnumber(int[] nums){
        int count = 0 ;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
     }

     static boolean even(int num){
        int numberofdigits = digits2(num);
        /*
        if(numberofdigits % 2 == 0){
        return true
        }
        return false
         */
         return numberofdigits % 2 == 0 ;



     }

     //count number of digits in a number
     static int digits(int num){
        if(num<0){
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0 ;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;

     }

    // modyfied way to find digits
    static int digits2(int num) {
        return (int) (Math.log10(num)) + 1;
    }









}
