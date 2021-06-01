package main.java.com.vvvxd.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3,5, 4, 6};
        System.out.println(checkDuplicates(arr));
        int[] arr2 = {10, 5, 3, 1,4, 6};
        System.out.println(indicesSumOfTwo(arr2, 9));
    }

    static boolean checkDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.add(j))
                return true;
        }
        return false;
    }

    public static  ArrayList<Integer> indicesSumOfTwo(int[] numbers, int expectedResult) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = expectedResult - numbers[i];
            if (map.containsKey(delta)) {
                ArrayList<Integer> res =  new ArrayList<>() ;
                res.add(map.get(delta));
                res.add(i);
                return res;
            }
            map.put(numbers[i], i);
        }
        ArrayList<Integer> res =  new ArrayList<>() ;
        res.add(-1);
        res.add(-1);
        return res;
    }
}
