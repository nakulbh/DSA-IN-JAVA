package com.binarysearch;

public class squareroot {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int i = 1;
            while (num > 0) {
                num -= i;
                i += 2;
            }
            return num == 0;
        }
    }

/* The given code is an implementation of a mathematical concept that can be used to determine whether a given number is a perfect square or not.

The code defines a function named isPerfectSquare that takes an integer num as input and returns a boolean value indicating whether num is a perfect square or not.

The approach used in this code is to subtract a series of odd numbers from the given num until num becomes either zero or negative. If num becomes zero, it means that the original number was a perfect square, otherwise it is not.

The code uses a while loop that continues to subtract odd numbers from num until num becomes zero or negative. The loop starts with i=1, which is the first odd number, and increments i by 2 in each iteration to get the next odd number. In each iteration, the value of i is subtracted from num.

If num becomes zero after the loop, the function returns true indicating that the input num is a perfect square. If num becomes negative, it means that the input num is not a perfect square and the function returns false.

The time complexity of this approach is O(sqrt(n)), where n is the input num, because in the worst case scenario the loop will execute sqrt(n) times. However, the actual number of iterations in most cases will be less than sqrt(n).

The space complexity of this approach is O(1), as the algorithm only uses constant space to store the variable i.

Here's the complete code:

arduino
Copy code
class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}





 */




}
