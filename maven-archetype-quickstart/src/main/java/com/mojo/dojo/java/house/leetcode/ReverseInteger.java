package com.mojo.dojo.java.house.leetcode;

public class ReverseInteger {
    
    public int reverse(int x){
        long output = 0;
        boolean negative = false;

        if( x < 0 ){
            x = x * -1;
            negative = true;
        }

        while (x > 0){
            output = output * 10 + (x % 10);
            x = x/10;
        }

        if(output > Integer.MAX_VALUE) return 0;
        
        
        if(negative){
            return (int) output * -1;
        }

        return (int) output;


    }
}


/* 
    Assume we are dealing tih an environment that could only store integers within the 32-bit signed integer range: [-2^31, 2^31-1]
    for the purpose of this problem, assume that your function returns 0 when the reversed integer overflows

    Ejemplo:
    Input: x = 123
    Output: 321

 */