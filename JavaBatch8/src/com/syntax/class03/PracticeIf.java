package com.syntax.class03;

public class PracticeIf {

	public static void main(String[] args) {

		/*int test=6;
		if (test == 9) {
			System.out.println("yes");
		}else System.out.println("no");
*/
		//1. Declare variable and increase by 100 using shorthand operator
		int num=100;
		num+=100;
		System.out.println(num);
		//2. Declare variable and decrease by 67 using shorthand operator
		num-=67;//210
		System.out.println(num);
		//3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		//4. Declare variable cakePiece=25 and divide cakePiece between 7 people . Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		int cake=25;
		cake%=7;
		System.out.println(cake);
		
		
	}

}


