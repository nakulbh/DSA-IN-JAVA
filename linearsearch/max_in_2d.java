package com.linearsearch;

import java.util.ArrayList;
import java.util.Scanner;

public class max_in_2d
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> r = new ArrayList<>(10);


        //intialisation

        for (int i = 0; i < 3; i++)
        {
            r.add(new ArrayList<>());

        }

        // input

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < r.size(); j++)
            {
                r.get(i).add(in.nextInt());

            }

        }
        System.out.println();

        int[] ans = new int[]{max(r)};//Using int max(r) would be incorrect because max(r) returns an int value, but ans is an array of integers. The new int[]{max(r)} expression creates a new array of integers with a single element, which is the maximum value returned by the max() method.
        System.out.println("Maximun value is  ("+ ans[0]+")");

        System.out.print(r);


    }

    static int max(ArrayList<ArrayList<Integer>> arr)
    {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++)
        {
            for (int j = 0; j < arr.get(i).size(); j++)
            {
                if (arr.get(i).get(j) > maximum)
                {
                    maximum = arr.get(i).get(j);
                }


            }
        }
        return maximum;
    }


}
