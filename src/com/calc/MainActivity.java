package com.calc;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity{
	
	private Calculator calculator;
    private CalculatorUI ui;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        calculator = new Calculator();
        ui = new CalculatorUI(this);
        
        setContentView(ui.getLayout());    
    }
    
    public void addNumber(int number){
    	calculator.appendToCurrentNumber(number);
    	ui.getDisplay().setText(calculator.getCurrentNumber());
    }

	public void addOperation(Operator operator) {
		ui.getDisplay().setText(String.valueOf(calculator.calculate(operator)));
	}
}