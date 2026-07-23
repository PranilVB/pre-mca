/*
Problem: Reverse String (LeetCode 344)

Description:
Write a function that reverses a character array in-place.
Do not allocate extra space for another array.

Approach:
1. Use two pointers:
   - Left pointer starts at index 0.
   - Right pointer starts at the last index.
2. Swap the characters at both pointers.
3. Move the left pointer forward and the right pointer backward.
4. Continue until both pointers meet or cross.

Example:
Input:
['h','e','l','l','o']

Output:
['o','l','l','e','h']

Time Complexity: O(n)
Space Complexity: O(1)

Status: Completed
*/

public class ReverseString {

    public static void reverseString(char[] s) {

        int right = s.length - 1;
        int left = 0;

        for (int i = right; left < i; i--) {

            char temp = s[i];
            s[i] = s[left];
            s[left] = temp;

            left++;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.println(s);
    }
}