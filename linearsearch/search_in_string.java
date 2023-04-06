package com.linearsearch;

import java.util.Arrays;

public class search_in_string
{
    public static void main(String[] args)
    {
        String name = "Nakul";
        char target = 'b';
        boolean ans = search(name, target);
        ans = search2(name, target);

        System.out.println(ans);

        System.out.println(Arrays.toString(name.toCharArray())); // converting String into char array

    }
    static boolean search(String str, char target )
    {
        for (int i = 0; i < str.length(); i++)
        {
            char charter = str.charAt(i);
            if (charter==target) return true;

        }
        return false;
    }

    static boolean search2(String str, char target )
    {
        for (char ch : str.toCharArray())// string to array of char
        {
            if (ch == target) return true;


        }
        return false;
    }
}

