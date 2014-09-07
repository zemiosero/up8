package com.example.gamesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Floar5_3Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.floar1_3);

	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

	}

	public void btnOnLeft(View v) {
		Intent it =new Intent();
		it.setClass(Floar5_3Activity.this, Floar5_2Activity.class);
		startActivityForResult(it,R.id.button2);
		overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);

	}


	public void btnOnRight(View v){
		Intent it =new Intent();
		it.setClass(Floar5_3Activity.this, Floar5_4Activity.class);
		startActivityForResult(it,R.id.button3);
		overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);


	}

}
