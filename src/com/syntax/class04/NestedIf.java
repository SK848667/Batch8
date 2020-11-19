package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		//variable for allergy-yes or no
		//if yes --> pet allergy, peanut allergy, pollen allergy
		//if no allergy "You are lucky!"
		boolean allergy=false;
		boolean pet=true;
		boolean peanut=true;
		boolean pollen=false;
		if (allergy) {//true
			System.out.println("Lets do futher check");
			if(pet) {
				System.out.println("please no cats or dogs in the house");
			}
			if(peanut) {
				System.out.println("please no peanut");
			}
			if(pollen) {
				System.out.println("please use mask");
			}
		}else {
			System.out.println("You are lucky!");
		}
		System.out.println("*****************************************");
		//if today friday -> We will watch movie
		//if 13-> I will watch scary movie
		//if it is not 13-> I will watch comedy
		//if no Friday-> I am studying
		boolean friday=false;
		int date=13;
		boolean monday=true;
		
		if (friday) {
			if(date==13) {
				System.out.println("I will watch scary movie");
			}
			if(date!=13) {
				System.out.println("I will watch comedy");
			}
			
		}else {
			if (monday) {
				System.out.println("I will take a rest");
			}else {
			System.out.println("no Friday-> I am studying");
			}
		}
		System.out.println("*****************************************");
		//check if assignment is completed
		//if assignment is completed: 
		//if your score>90-->Great job
		//if score>80-->Good job
		//if score>70->>Please study more
		boolean assignment=true;
		int score=92;
		if(assignment) {
			//System.out.println("Your score is: ");
			if(score>=90) {
				System.out.println("Great job");
			}else if(score>=80) {
				System.out.println("Good job");
			}else if(score>=70) {
				System.out.println("Please study more");
			}else {
				System.out.println("Good job for trying but you must study");
			}
		}else {
			System.out.println("You should complete all assignment");
		}
		
		System.out.println("*****************************************");
		
		
	}
}


