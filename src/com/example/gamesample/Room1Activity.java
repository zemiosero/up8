package com.example.gamesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Room1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.floar1_1);

		Button nextBtn = (Button)findViewById(R.id.btnR1);
        nextBtn.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent it =new Intent();
				it.setClass(Room1Activity.this, Room2Activity.class);
				startActivity(it);

			}});
	}

}
