package javaTPoint;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter age");
		int age=input.nextInt();
		System.out.println("enter weight");
		float weight=input.nextFloat();	
		if(age>18) {
			if(weight>=56) {
				System.out.println("age and weight are proper to donoate blood ");}
		
		else {
			System.out.println("please work on your weight to donate blood");
			 }
		}
		
		else {
			System.out.println("not eligible to donate blood");
		}
		

	}

}
