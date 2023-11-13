package com.example.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
        public static boolean isValid (String s){
            while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
                s = s.replace("{}", "");
                s = s.replace("()", "");
                s = s.replace("[]", "");
            }
            return s.isEmpty();
        }
    }
