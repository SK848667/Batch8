package com.syntax.class07;

public class WhileLoop2BREAK {

	public static void main(String[] args) {
		
//		create a boolean variable workDay and assign true create int variable day and assign it to 1
//		-as long as it is workDay print "I need a day off" and increase day.
//		-Once day is 6 print" i dont need a day off any more"
		boolean workDay = true;
	    int day=1;
	    
	    while(workDay){
	      
	      if(day<6){
	    	  System.out.println("I need a day off");
	      }else {
	    	  System.out.println("Its weekend and i am off");
	    	  break;
	      }
	      day++;
	    }

	}

}
