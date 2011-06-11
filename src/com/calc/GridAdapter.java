package com.calc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter {

	private Context context;
	
	public GridAdapter(Context context){
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return 14;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if( position >= 0 && position <=9 ){
			return new NumberButton(context, position);
		}else if( position == 10 ){
			return new OperatorButton(context, Operator.ADD); 
		}else if( position == 11 ){
			return new OperatorButton(context, Operator.SUB); 
		}else if( position == 12 ){
			return new OperatorButton(context, Operator.MULT); 
		}else{
			return new OperatorButton(context, Operator.EQUAL); 
		}
	}

}
