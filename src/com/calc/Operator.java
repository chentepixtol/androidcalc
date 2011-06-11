package com.calc;

public class Operator {
	
	private char operation;
	
	public static final char ADD = '+';
	public static final char SUB = '-';
	public static final char MULT = '*';
	public static final char EQUAL = '=';
	
	public Operator(char operation){
		this.operation = operation;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public int calculate(int number1, int number2)
	{
		int result = 0;
		
		if( ADD == getOperation() ){
			result = number1 + number2;
		}else if( SUB == getOperation() ){
			result = number1 - number2;
		}else if( MULT == getOperation() ){
			result = number1 * number2;
		}else if( EQUAL == getOperation() ){
			result = number1;
		}
		
		return result;
	}
	

}
