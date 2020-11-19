package com.syntax.class08;

import java.util.Scanner;

public class HwTest {

	public static void main(String[] args) {
	    Scanner inp;
	    int y;
	    System.out.print("In:");
	    //write code under on step 8
	    
	    inp=new Scanner(System.in);
	    y=inp.nextInt();
	    for (int i = 0; i < y; i++) {
	      System.out.println(i);
	    }
	    


		
		
	    System.out.println("***********if enter 5 will sho 10///will show in double**********************");

	    int end;
	    System.out.print("Int:");
	    //write your code below
	    
	    inp=new Scanner(System.in);
		    end=inp.nextInt();
		    for (int i = 0; i < end*2; i++) {
		      System.out.print (i+" ");
		    }
	}

}
