package com.calculator;
import java.util.*;
public interface Operation {
Object operate(Object a,Object b);
}
interface NormalOperation extends Operation{
	Object operate(Object a,Object b,Object c);
}
interface ScientificOperation extends Operation{
}
interface StatisticalOperation extends Operation{
	Object operate(Object[] objStream);
}
 
class Add implements NormalOperation{

	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return (int)a+(int)b;
		}
		else {
			 return (double)a+(double)b;
		}
	}

	@Override
	public Object operate(Object a, Object b, Object c) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer" && c.getClass().getName()=="java.lang.Integer") {
			return (int)a+(int)b+(int)c;
		}
		else {
			 return (double)a+(double)b+(double)c;
		}
	}

	

	
}

class Subtract implements NormalOperation{

	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return (int)a-(int)b;
		}
		else {
			 return (double)a-(double)b;
		}
	}

	@Override
	public Object operate(Object a, Object b, Object c) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer" && c.getClass().getName()=="java.lang.Integer") {
			return (int)a-(int)b-(int)c;
		}
		else {
			 return (double)a-(double)b-(double)c;
		}
	}
	
}

class Multiply implements NormalOperation{

	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return (int)a*(int)b;
		}
		else {
			 return (double)a*(double)b;
		}
	}

	@Override
	public Object operate(Object a, Object b, Object c) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer" && c.getClass().getName()=="java.lang.Integer") {
			return (int)a*(int)b*(int)c;
		}
		else {
			 return (double)a*(double)b*(double)c;
		}
	}

	
}

class Divide implements NormalOperation{

	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return (int)a/(int)b;
		}
		else {
			 return (double)a/(double)b;
		}
	}

	@Override
	public Object operate(Object a, Object b, Object c) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer" && c.getClass().getName()=="java.lang.Integer") {
			return (int)a/(int)b/(int)c;
		}
		else {
			 return (double)a/(double)b/(double)c;
		}
	}
	
}

class Power implements ScientificOperation{

	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return Math.pow((int)a, (int)b);
		}
		else {
			return Math.pow((double)a, (double)b);
		}
	}

	
}

class Logarithm implements ScientificOperation{

	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return (Math.log((int)a)/Math.log((int)b));
		}
		else {
			return (Math.log((double)a)/Math.log((double)b));
		}
	}

	
	
}

class Mean implements StatisticalOperation{


	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return ((int)a+(int)b)/2;
		}
		else {
			return ((double)a+(double)b)/2;
		}
	}

	@Override
	public Object operate(Object[] objStream) {
		int len = objStream.length;
		if(objStream[0].getClass().getName()=="java.lang.Integer") {
			int res=0;
			for(Object obj:objStream) {
				res+=(int)obj;
			}
			return res/len;
		}
		double res=0;
	    for(Object obj:objStream) {
				res+=(double)obj;
			}
	    return res/len;
    }
	
}	

class Mode implements StatisticalOperation{

	@Override
	public Object operate(Object[] intStream) {
		Map<String,Integer> numFreqMap = new HashMap<>();
		for(Object num:intStream) {
			if(numFreqMap.containsKey(num)) {
				numFreqMap.put(num.toString(), numFreqMap.get(num)+1);
			}
			else {
				numFreqMap.put(num.toString(), 1);
			}
		}
		int min = Integer.MIN_VALUE,temp=0;
		String res="";
		for(Map.Entry<String,Integer> entry:numFreqMap.entrySet()) {
			temp = entry.getValue();
			if(temp>min) {
				min = temp;
				res = entry.getKey();
			}
		}
		return res;
	}

	@Override
	public Object operate(Object a, Object b) {
		if(a.getClass().getName()=="java.lang.Integer" && b.getClass().getName()=="java.lang.Integer") {
			return (int)a;
		}
		else {
			return (double)a;
		}
	}
	
	
}
