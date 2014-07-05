package com.example.gamesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Room5Activity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.floar1_5);

	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Button nextBtn = (Button)findViewById(R.id.button2);
		nextBtn.setOnClickListener(this);

		Button nextBtn2 = (Button)findViewById(R.id.button3);
		nextBtn2.setOnClickListener(this);

	}

	public void onClick(View v) {
		Intent it =new Intent();
		switch(v.getId()){
		case R.id.button2:
			it.setClass(Room5Activity.this, Room4Activity.class);
			startActivityForResult(it,R.id.button2);
			overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);

		case R.id.button3:
			it.setClass(Room5Activity.this, Room1Activity.class);
			startActivityForResult(it,R.id.button3);
			overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);


		}

	}

}
