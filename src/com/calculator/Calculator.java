package com.calculator;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Simple Calculator----Enter your choice!");
		int choice=0,stop=0;
		while(true) {
			choice = UserPrompt.getChoice("1.Normal Arithmetics\n2.Scientific Arithmetics\n3.Exit");
			switch(choice) {
			case 1:
				Arithmetic a = new NormalArithmetic();
				a.arithmetic();
				break;
			case 2:
				Arithmetic b = new ScientificArithmetic();
				b.arithmetic();
				break;
			case 3:
				stop=1;
				System.out.println("Exiting!!");
				break;
			}
			if(stop==1)
			   break;
		}
	}


}
