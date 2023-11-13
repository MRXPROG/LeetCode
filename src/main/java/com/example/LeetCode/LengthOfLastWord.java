package com.example.LeetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int result = 0;
        s = s.trim();
        for(int i = s.length()-1; ;i--){
            if( i < 0 || s.charAt(i) == ' ' ){
                break;
            }
            result++;

        }
        return result;
    }
}
