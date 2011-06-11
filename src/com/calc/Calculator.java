package com.calc;

public class Calculator {
	
	private int numberOne = 0;
	
	private int numberTwo = 0;
	
	private StringBuffer currentNumber;
	
	private Operator lastOperator;
	
	public Calculator(){
		currentNumber = new StringBuffer();
	}

	public int calculate(Operator operator){
		
		addNumber(Integer.parseInt(getCurrentNumber()));
		currentNumber = new StringBuffer("0");
		
		if( getNumberTwo() == 0 || lastOperator == null ){
			lastOperator = operator;
			return getNumberOne();
		}
		
		int result = lastOperator.calculate(getNumberOne(), getNumberTwo());
		setNumberOne(result);
		setNumberTwo(0);
		lastOperator = operator;
		return result;
	}
	
	public int getNumberOne() {
		return numberOne;
	}
	
	public void appendToCurrentNumber(int number)
	{
		currentNumber.append(number);
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	public void addNumber(int number)
	{
		if( numberOne == 0 ){
			setNumberOne(number);
		}
		else{
			setNumberTwo(number);
		}
	}
	
	public String getCurrentNumber() {
		return currentNumber.toString();
	}
	
}
