package com.calc;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OperatorButton extends Button implements OnClickListener {
	
	Operator operator;

	public OperatorButton(Context context, char operation) {
		super(context);
		operator = new Operator(operation);
		setText(String.valueOf(getOperation()));
		setOnClickListener(this);
	}

	private char getOperation() {
		return operator.getOperation();
	}

	@Override
	public void onClick(View v) {
		MainActivity activity = (MainActivity) v.getContext();
		activity.addOperation(operator);
	}

}
