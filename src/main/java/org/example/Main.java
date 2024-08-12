package org.example;

import org.example.solution.SmileyFace;
import org.example.solution.Permutations;
import org.example.solution.OddInt;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Test OddInt [1,2,2,3,3] : " + OddInt.findOdd(new int[]{1, 2, 2, 3, 3}));
        System.out.println("Test Count Smiley :-), :), ;( : "
                + SmileyFace.countSmiley(new String[]{":-)", ":)",";("}));

        System.out.println("Test Permutation [abc] : " + Permutations.permutation("abc") );
    }
}