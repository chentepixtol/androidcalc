package com.calc;

import android.content.Context;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CalculatorUI 
{
	LinearLayout layout;
	
	private TextView display;
	
	private Context context;

	public CalculatorUI(Context context)
	{
		this.context = context;
		layout = new LinearLayout(getContext());
		layout.setOrientation(LinearLayout.VERTICAL);
		GridView gv = new GridView(getContext());
		gv.setNumColumns(3);
		gv.setAdapter(new GridAdapter(getContext()));
	
		layout.addView(getDisplay());
		layout.addView(gv);
	}
    
    /**
     * 
     */
    private void initDisplay() {
    	display = new TextView(getContext());
    	display.setHeight(30);
    	display.setText("0");
	}

	/**
	 * 
	 */
	public TextView getDisplay() {
		if( display == null ){
			initDisplay();
		}
		return display;
	}
	
	public LinearLayout getLayout() {
		return layout;
	}

	public void setLayout(LinearLayout layout) {
		this.layout = layout;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public void setDisplay(TextView display) {
		this.display = display;
	}

}
