package com.calculator;
import java.util.*;
public class UserPrompt {
	static Scanner sc = new Scanner(System.in);
	static Object[] objStream;
	
	
	public static int getNumberCount(String s) {
		System.out.println(s);
		int n = sc.nextInt();
		sc.nextLine();
		if(n==1) {
			System.out.println("Atleast two numbers should be there!");
			return 0;
		}
		return n;
	}
	
	
	public static Object getNumber(String s) {
		String num;
		System.out.println(s);
		num=sc.next();
		Object res;
		try {
			res = Double.parseDouble(num);
		}
		catch(NumberFormatException e) {
			try {
				res = Integer.parseInt(num);
			}
			catch(NumberFormatException e1){
				res = num;
			}
		}
		return res;
	}
	
	
	public static int getChoice(String s) {
		System.out.println(s);
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	
	public static int isStreamOfNumber(String s) {
		System.out.println(s);
		String[] sarr = sc.nextLine().trim().split(" ");
		int slen = sarr.length;
		int identifier=isstreamContainsDouble(sarr);
		if(identifier==-1)
			return -1;
		objStream = new Object[slen];
		if(identifier==0) {
			for(int idx=0;idx<slen;idx++) {
				objStream[idx] = Integer.parseInt(sarr[idx]);
			}
		}
		else {
			for(int idx=0;idx<slen;idx++) {
				objStream[idx] = Double.parseDouble(sarr[idx]);
			}
		}
		return identifier;
	}
	
	
	private static int isstreamContainsDouble(String[] sarr) {
		for(String s:sarr) {
			try {
				Integer.parseInt(s);
			}
			catch(NumberFormatException e){
				try {
					Double.parseDouble(s);
					return 1;
				}
				catch(NumberFormatException e1){
					return -1;
				}
			}
		}
		return 0;
	}
}
