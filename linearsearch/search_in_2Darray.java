package com.linearsearch;

import java.util.ArrayList;
import java.util.Scanner;

public class search_in_2Darray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int target = 3;
        ArrayList<ArrayList<Integer>> l = new ArrayList<>(10);


        //intialisation

        for (int i = 0; i < 3; i++)
        {
            l.add(new ArrayList<>());

        }

        // input

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < l.size(); j++)
            {
                l.get(i).add(in.nextInt());

            }

        }
        System.out.println();

        int[] ans = search( l, target);
        System.out.println("Traget found at ("+ ans[0]+","+ans[1]+")");

        System.out.print(l);


    }

    static int [] search(ArrayList<ArrayList<Integer>> arr, int target)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            for (int j = 0; j < arr.get(i).size(); j++)
            {
                if (arr.get(i).get(j)==target)
                {
                    return new int[]{i,j};
                }


            }
        }
        return new int[] {-1,-1};
    }


}

