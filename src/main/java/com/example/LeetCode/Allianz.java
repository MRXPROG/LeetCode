package com.example.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Allianz {

    /*Дан массив из целых чисел, нужно найти максимальное число в нем,
     которое обязательно имеет в этом массиве зеркальное отрицательное,
     равное ему по модулю. Иначе вернуть ноль. Т.е. в массиве [5, -3, 1, 3, -2]
     правильный ответ будет 3, т.к. "-3" в нем есть, а "-5" нету, потому 5 не подходит.
     Для массива [1,2,3, -5] функция должна вернуть 0, так как ни для одного
     положительного числа в нем нет равного ему по модулю отрицательного
     */
    public static void main(String[] args) {
        int[] arr1 = {5, -3, 1, 3, -2};
        int[] arr2 = {1, 2, 3, -5};
        int[] arr3 = {0, 0, 0, 0, 0};
        int[] arr4 = {1, 10, 2, 3, -10, 5, -5};
        int[] arr5 = {1, -1};

        System.out.println("Solve by Map: " + Allianz.solvingByMap(arr3));
        System.out.println("Solve by StreamApi: " + Allianz.solvingByMap(arr3));
    }

    public static int solvingByMap(int[] mass){

        int result = 0;
        Set<Integer> set = new HashSet<>();

        for(int i =0; i < mass.length; i++){

            if(mass[i]  > 0){
                if (set.contains(-mass[i])) {
                    result = Math.max(result, mass[i]);
                } else{
                    set.add(mass[i]);
                }
            }
            if(mass[i] < 0){
                if(set.contains(-mass[i])){
                    result = Math.max(result, -mass[i]);
                }else{
                    set.add(mass[i]);
                }
            }
        }
        return result;
    }

    public static int solvingByStreamApi(int[] mass){
        return Arrays.stream(mass)
                .filter(num -> num > 0)
                .filter(num -> Arrays.stream(mass).anyMatch(negative -> negative == -num))
                .max()
                .orElse(0);
    }
}
