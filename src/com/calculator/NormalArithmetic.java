package com.calculator;
public class NormalArithmetic implements Arithmetic {
	    static int choice=0;
	    public NormalArithmetic() {
		}
		public NormalArithmetic(int choice) {
			NormalArithmetic.choice = choice;
		}
	    public void arithmetic() {
			if(choice==0) {
	    	  choice = UserPrompt.getChoice("---Normal Arithmetics---Enter Your Choice\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
			}
	    	int n=0;
	    	Object a=0;
	    	Object b=0;
	    	Object c=0;
			Object res=0;
			switch(choice) {
				case 1:
					System.out.println("---Addition---");
					NormalOperation op = new Add();
					n=UserPrompt.getNumberCount("Enter how many numbers to be added!");
					if(n<2 || n>3) {
						redoArithmetic(choice);
						choice=0;
						break;
					}
					a=UserPrompt.getNumber("Enter your 1st number");
					b=UserPrompt.getNumber("Enter your 2nd number");
					if(n>2) {
						c=UserPrompt.getNumber("Enter your 3rd number");
					}
					res = n>2?op.operate(a,b,c):op.operate(a,b);
					System.out.println("Result:"+res);
					System.out.println();
					choice=0;
					break;
				case 2:
					System.out.println("---Subtraction---");
					NormalOperation op1 = new Subtract();
					n=UserPrompt.getNumberCount("Enter how many numbers to be subtracted!");
					if(n<2 || n>3) {
						redoArithmetic(choice);
						choice=0;
						break;
					}
					a=UserPrompt.getNumber("Enter your 1st number");
					b=UserPrompt.getNumber("Enter your 2nd number");
					if(n>2) {
						c=UserPrompt.getNumber("Enter your 3rd number");
					}
					res = n>2?op1.operate(a,b,c):op1.operate(a,b);
					System.out.println("Result:"+res);
					System.out.println();
					choice=0;
					break;
				case 3:
					System.out.println("---Multiplication---");
					NormalOperation op2 = new Multiply();
					n=UserPrompt.getNumberCount("Enter how many numbers to be multiplied!");
					if(n<2 || n>3) {
						redoArithmetic(choice);
						choice=0;
						break;
					}
					a=UserPrompt.getNumber("Enter your 1st number");
					b=UserPrompt.getNumber("Enter your 2nd number");
					if(n>2) {
						c=UserPrompt.getNumber("Enter your 3rd number");
					}
					res = n>2?op2.operate(a,b,c):op2.operate(a,b);
					System.out.println("Result:"+res);	
					System.out.println();
					choice=0;
					break;
				case 4:
					System.out.println("---Division---");
					NormalOperation op3 = new Divide();
					n=UserPrompt.getNumberCount("Enter how many numbers to be divided!");
					if(n<2 || n>3) {
						redoArithmetic(choice);
						choice=0;
						break;
					}
					a=UserPrompt.getNumber("Enter your 1st number");
					b=UserPrompt.getNumber("Enter your 2nd number");
					if(n>2) {
						c=UserPrompt.getNumber("Enter your 3rd number");
					}
					res = n>2?op3.operate(a,b,c):op3.operate(a,b);
					System.out.println("Result:"+res);	
					System.out.println();
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
	    	System.out.println("!!!Numbers range Should be 2 or 3!!!");
			Arithmetic arith = new NormalArithmetic(choice);
			arith.arithmetic();
	    }
}
