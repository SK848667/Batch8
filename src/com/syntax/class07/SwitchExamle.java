package com.syntax.class07;

public class SwitchExamle {

	public static void main(String[] args) {

		String month = "January";
		//"OR || " EXAMPLE IN SWITCH-------- BUT NOT YOU USE IT----------
		//if month is December January or February-> Winter
		//if month is March, April or May-> Spring
		

		switch(month){
		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
		case "June":
		case "July":
		case "August":
			System.out.println("Summer");
			break;
			
		}
	}

}
