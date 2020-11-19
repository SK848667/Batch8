package com.syntax.class02;

public class ArilthemeticSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 2;
		
		int add = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		System.out.println("The result of add " + num1 + " + " + num2 + " = " + add);
		System.out.println("The result of subtraction " + num1 + " - " + num2 + " = " + sub);
		System.out.println("The result of multiplication " + num1 + " * " + num2 + " = " + mult);
		System.out.println("The result of division " + num1 + " / " + num2 + " = " + div);

		double num3=3.9;
		double num4=3.9*3.9;
		System.out.println("The square of the numbers 3.9 is "+num4);
		
		
		int width=5;
		int height=8;
		int multi=width*height;
		int per=width+width+height+height;
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equals to "+per+" and the area equals to " +multi);
		//The perimeter of a rectangle with width 5 and height 8 is equals to 26 and the area equals to 40
	}

}
