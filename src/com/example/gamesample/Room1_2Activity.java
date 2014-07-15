package com.example.gamesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Room1_2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.room1_2);
	}

	public void btnOnRight(View v) {
		Intent it =new Intent();
		it.setClass(Room1_2Activity.this, Room1_1Activity.class);
		startActivityForResult(it,R.id.button2);
		overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);

	}

	public void btnOnLeft(View v){
		Intent it =new Intent();
		it.setClass(Room1_2Activity.this, Room1_1Activity.class);
		startActivityForResult(it,R.id.button3);
		overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);


	}


	public void imgClick(View v){
		Intent it =new Intent();
		it.setClass(Room1_2Activity.this, Floar1_1Activity.class);
		startActivityForResult(it,R.id.imdout);
	}

}
