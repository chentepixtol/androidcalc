package com.calc;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NumberButton extends Button implements OnClickListener {

	private int number;
	
	public NumberButton(Context context, int number) {
		super(context);
		setNumber(number);
		setText(getNumberAsString());
		setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		MainActivity activity = (MainActivity) v.getContext();
		activity.addNumber(getNumber());
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	public String getNumberAsString()
	{
		return String.valueOf(getNumber());
	}

}
