package com.linearsearch;

public class searching_index {
    public static void main(String[] args)
    {
        int[] num = {10,45,67,34,89};
        int target = 9;
        int ans = linearsearch(num,target );
        System.out.println(ans);


    }

    static int linearsearch(int[] arr , int target)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++)
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
