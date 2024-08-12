package org.example.solution;

import java.util.*;

public class Permutations {
    public static Set<String> permutation(String input) {
        Set<String> result = new HashSet<>();
        result.add(input.charAt(0)+"");
        if(input.length()==1){
            return result;
        }

        for (int i = 1; i < input.length(); i++) {
            Set<String> temp = new HashSet<>();
            char currentChar = input.charAt(i);
            System.out.println("\n==== Loop " + i + " of " + input.length() + " ====");
            System.out.println("Result Contains : " + result);
            System.out.println("Result Size : " + result.size());

            //for logging purpose
            int n = 1;

            for (String combination : result) {
                System.out.println("\n**** Loop element " + n + " : " + combination + " ****");

                for (int j = 0; j <= combination.length(); j++) {
                    String prefix = combination.substring(0, j);
                    String suffix = combination.substring(j);
                    System.out.println("\nString prefix : " + prefix);
                    System.out.println("String suffix : " + suffix);
                    System.out.println("Current Char : " + currentChar);
                    String newCombination = prefix + currentChar + suffix;
                    System.out.println("New String Combination : " + newCombination);
                    temp.add(newCombination);
                }
                //for logging purpose
                n++;
            }
            result = temp;
            System.out.println("New Result : " + result);
        }

        return result;
    }
}
