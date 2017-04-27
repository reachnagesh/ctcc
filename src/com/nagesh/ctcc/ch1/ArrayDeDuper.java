package com.nagesh.ctcc.ch1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nagesh on 4/26/17.
 */
public class ArrayDeDuper {
    public static int[] deDupeWithArrayList(int[] input) {
        List<Integer> intList = new ArrayList<>();
        if (input.length == 0) {
            return input;
        } else {
            for (int i : input) {
                if (!intList.contains(i)) {
                    intList.add(i);
                }
            }
            return intList.stream().mapToInt(Number::intValue).toArray();
        }
    }

    public static boolean isArrayUnique(int[] input) {
        if (input.length == 0) {
            return false;
        } else if (input.length == 1) {
            return true;
        } else {
            for (int i = 0; i < input.length; i++) {
                for (int j = i + 1; j < input.length; j++) {
                    if (input[i] == input[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
