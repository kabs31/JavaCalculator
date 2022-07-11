package com.calculator;
public class ScientificArithmetic implements Arithmetic {
	static int choice=0;
	public ScientificArithmetic(int choice) {
		ScientificArithmetic.choice = choice;
	}
	public ScientificArithmetic() {
		
	}
	@Override
	public void arithmetic() {
		if(choice==0)
			choice = UserPrompt.getChoice("---Scientific and Statistical Arithmetics---Enter Your Choice\n1.Power\n2.Logarithm\n3.Mean\n4.Mode\n5.Exit");
		Object a,b,res;
		int isNumStream;
		switch(choice) {
			case 1:
				System.out.println("---Power---");
				ScientificOperation op = new Power();
				a=UserPrompt.getNumber("Enter your Base");
				b=UserPrompt.getNumber("Enter your Exponent");
				res = op.operate(a,b);
				System.out.println("Result:"+res);
				System.out.println();
				choice=0;
				break;
			case 2:
				System.out.println("---Logarithm---");
				ScientificOperation op1 = new Logarithm();
				a=UserPrompt.getNumber("Enter your base");
				b=UserPrompt.getNumber("Enter your argument");
				res = op1.operate(a,b);
				System.out.println("Result:"+res);	
				System.out.println();
				choice=0;
				break;
			case 3:
				System.out.println("---Mean---");
				StatisticalOperation op2 = new Mean();
				isNumStream = UserPrompt.isStreamOfNumber("Enter the numbers spaced evenly to find Mean");
				if(isNumStream!=-1) {
					res = op2.operate(UserPrompt.objStream);
					System.out.println("Result:"+res);	
					System.out.println();
				}
				else {
					redoArithmetic(choice);
				}
				choice=0;
				break;
			case 4:
				System.out.println("---Mode---");
				StatisticalOperation op3 = new Mode();
				isNumStream = UserPrompt.isStreamOfNumber("Enter the numbers spaced evenly to find Mode");
				if(isNumStream!=-1) {
					res = op3.operate(UserPrompt.objStream);
					System.out.println("Result:"+res);	
					System.out.println();
				}
				else {
					redoArithmetic(choice);
				}
				choice=0;
				break;
			case 5:
				System.out.println("Exiting!");
				System.out.println();
				choice=0;
				break;
			default:
				System.out.println("Invalid Option");
				System.out.println();
				break;
		}
	}
	private static void redoArithmetic(int choice) {
    	System.out.println("!!! Only real numbers should be present !!!");
		Arithmetic arith = new ScientificArithmetic(choice);
		arith.arithmetic();
    }

}
