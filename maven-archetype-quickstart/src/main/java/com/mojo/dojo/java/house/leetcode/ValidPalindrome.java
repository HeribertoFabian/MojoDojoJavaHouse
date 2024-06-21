package com.mojo.dojo.java.house.leetcode;

public class ValidPalindrome {

    public boolean isPalindromeSolution1(String s) {
        String newString = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                newString += c;
            }
        }

        newString = newString.toLowerCase();

        int start = 0;
        int end = newString.length() - 1;

        while (start < end) {
            if (newString.charAt(start) != newString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    
}


/*
 * Given a String, determine if it is a palindrome, considering only alphanumeric characters
 * and ignoring cases
 * 
 * Note: For the purpose of this problem, we define empty string as valid palindrome
 * 
 * Example 1:
 * Input: "A man, a plan, a canal: panama"
 * output: true
 * 
 * Example 2:
 * Input: "race a car"
 * Output: false
 */