package org.example.solution;

import java.util.*;

public class OddInt {
    public static int findOdd(int[] input) {
        try {
            if (input.length == 1) {
                return input[0];
            }

            Map<Integer, Integer> numMap = new HashMap<>();
            for (int i : input) {
                if (!numMap.containsKey(i)) {
                    numMap.put(i, 1);

                } else {
                    numMap.replace(i, numMap.get(i) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> numCount : numMap.entrySet()) {
                if (numCount.getValue() %2 != 0) {
                    return numCount.getKey();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

        return -1;
    }
}
