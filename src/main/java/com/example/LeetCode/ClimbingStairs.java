package com.example.LeetCode;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
6
2) 2 2 2
1) 1 1 1 1 1 1

1 1 1 1 1 1 1
2 1 1 1 1 1 = 6
2 2 1 1 1 = 5
2 2 2 1 = 4

1 2 3 4 5
1 2 3
16

 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return n;
        }

        int n1 = 1;
        int n2 = 2;

        for (int i = 3; i <= n; i++) {
            int next = n1;
            n1 = n2;
            n2 = next + n2;
        }

        return n2;
    }
}
