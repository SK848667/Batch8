package com.syntax.class16;
import java.util.Scanner;
/*
Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
public class HW3 {
    private static char getGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score >80) {
            return 'B';
        } else if (score >70) {
            return 'C';
        } else if (score >50) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = inpu.nextInt();
        System.out.println("Your grade is: "+getGrade(score));
    }
}