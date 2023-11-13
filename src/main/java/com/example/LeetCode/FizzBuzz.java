package com.example.LeetCode;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List fizzbuzz = new ArrayList();
        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                fizzbuzz.add("FizzBuzz");
            }
            else if (x % 3 == 0) {
                fizzbuzz.add("Fizz");
            }
            else if (x % 5 == 0) {
                fizzbuzz.add("Buzz");
            }else{
                fizzbuzz.add(String.valueOf(x));
            }
        }
        return fizzbuzz;
    }
}

