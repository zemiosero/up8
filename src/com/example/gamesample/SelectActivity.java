package com.example.gamesample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Button sbt1 = (Button)findViewById(R.id.sbt1);
		sbt1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.sbt1:
				setContentView(R.layout.test1);
			case R.id.sbt2:
				setContentView(R.layout.test1);
			case R.id.sbt3:
				setContentView(R.layout.test1);
			case R.id.sbt4:
				setContentView(R.layout.test1);
			case R.id.sbt5:
				setContentView(R.layout.test1);
			case R.id.sbt6:
				setContentView(R.layout.test1);
			case R.id.sbt7:
				setContentView(R.layout.test1);
			case R.id.sbt8:
				setContentView(R.layout.test1);
			case R.id.sbt9:
				setContentView(R.layout.test1);
			case R.id.sbt10:
				setContentView(R.layout.test1);
			case R.id.sbt11:
				setContentView(R.layout.test1);
			case R.id.sbt12:
				setContentView(R.layout.test1);
			case R.id.sbt13:
				setContentView(R.layout.test1);
			case R.id.sbt14:
				setContentView(R.layout.test1);
			case R.id.sbt15:
				setContentView(R.layout.test1);
			case R.id.sbt16:
				setContentView(R.layout.test1);
		}
	}



}
