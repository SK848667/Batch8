package com.syntax.class00review.review02;

public class LogicalOperators {

	public static void main(String[] args) {
		String day = "Sunday";

		////////////////// FIRST//////////////////////////////
		
		  if (day.equalsIgnoreCase("Sunday")) {
		  System.out.println("Relax its Sunday just dont blink or it will be over");
		  
		  } else if (day.equalsIgnoreCase("Sarurday")) {
		  System.out.println("Relax its Sarurday just dont blink or it will be over");
		  
		  } else { System.out.println("GO to work"); }
		 
		///////////// SECOND /////////////////////////////

		if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Sarurday")) {
			System.out.println("Relax its weekend just dont blink or it will be over");

		} else {
			System.out.println("GO to work");
		}

	}

}
