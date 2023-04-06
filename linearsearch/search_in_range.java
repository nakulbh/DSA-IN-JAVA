package com.linearsearch;

public class search_in_range {
    public static void main(String[] args)
    {
        int[] num = {10,45,67,34,89};
        int target = 34;
        int start = 2;
        int end = 4;
        int ans = linearsearch(num,target, start, end);
        System.out.println(ans);


    }

    static int linearsearch(int[] arr , int target, int start, int end)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for (int i = start; i <= end; i++)
        {
            //check for element at every index if  it is = target
            int element = arr[i];
            if (element==target)
            {
                return i;
            }


        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;

    }
}
