package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F*/
		Scanner scan;
	    int quiz, mid, finalScore,avg;
	    scan = new Scanner(System.in);
	    
	    System.out.println("Please enter your quiz score");
	    quiz = scan.nextInt();
	    
	    System.out.println("Please enter your mid term score");
	    mid = scan.nextInt();
	    
	    System.out.println("Please enter your final score");
	    finalScore = scan.nextInt();
	    
	    avg = (quiz + mid + finalScore)/3;
	    System.out.println(avg);
	    
	    /*if(avg>=90) {
	    	System.out.println("Grade = A");
	    	System.out.println("You are a good Student");
	    }else if(avg>=70 && avg<90) {
	    	System.out.println("Grade = B");
	    	System.out.println("You are a good Student");
	    }else if(avg>=50 && avg>70) {
	    	System.out.println("Grade = C");
	    	System.out.println("Please study more");
	    }else if (avg>=40 && avg<50) {
	    	System.out.println("Grade = D");
	    	System.out.println("Please study more");
	    }else {
	    	System.out.println("Grade = F");
	    	System.out.println("Please study more");
	    }
	    */
	    char grade;
	    if(avg>=90) {
	    	grade='A';
	    }else if(avg>=70 && avg<90) {
	    	grade='B';
	    }else if(avg>=50 && avg>70) {
	    	grade='C';
	    }else if (avg>=40 && avg<50) {
	    	grade='D';
	    }else {
	    	grade='F';
	    }
	    System.out.println("Grade = " + grade);
	    
	   if(grade=='A' || grade=='B') {   
	   }else {
		   System.out.println("Please study more");
	   }
	    
	}
}
