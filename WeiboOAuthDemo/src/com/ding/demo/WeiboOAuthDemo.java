package com.ding.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class WeiboOAuthDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_weibo_demo);
	}

	public void goLogin(View v) {
		Intent login = new Intent(this, Login.class);
		startActivity(login);
	}

	public void goRegister(View v) {
		Intent login = new Intent(this, Register.class);
		startActivity(login);
	}
}
