package com.example.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(int x) {
        List originalList = String.valueOf(x).chars().mapToObj(ch -> (char) ch).toList();
        List<Character> palindromeList = new ArrayList<>(originalList);
        Collections.reverse(palindromeList);
        boolean isEqual = originalList.equals(palindromeList);
        return isEqual;
    }
}
