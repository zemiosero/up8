package com.example.gamesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Floar4_1Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.floar1_1);

	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

	}

	public void btnOnLeft(View v) {
		Intent it =new Intent();
		it.setClass(Floar4_1Activity.this, Floar4_5Activity.class);
		startActivityForResult(it,R.id.button2);
		overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);

	}

	public void btnOnRight(View v){
		Intent it =new Intent();
		it.setClass(Floar4_1Activity.this, Floar4_2Activity.class);
		startActivityForResult(it,R.id.button3);
		overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);


	}

	public void imgClick(View v){
		Intent it =new Intent();
		it.setClass(Floar4_1Activity.this, Room1_1Activity.class);
		startActivityForResult(it,R.id.imd1);
	}

}

