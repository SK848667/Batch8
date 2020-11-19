package com.syntax.class12;

import java.awt.*;
import java.util.Scanner;

public class repl_it {

    public static void main(String[] args) {






        int[][] number = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sum = 0;
        for (int[] original : number) {
            for (int orig : original) {
                if (orig%2==0) {
                    sum=orig;
                }
            }
        }
        System.out.println(sum);






















    }


}


