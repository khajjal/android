package com.example.we_split;


import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewUserActivity extends Activity implements OnClickListener {

	private Button userRegister;private Button userCancel;private EditText userName;private EditText userPassword;
	private EditText userEmail;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_user);


		userRegister = (Button)findViewById(R.id.buttonRegister);
		userCancel = (Button)findViewById(R.id.buttonCancel);
		userRegister.setOnClickListener(this);
		userCancel.setOnClickListener(this);
	}

	public void onClick(View v) {

		switch(v.getId()){

			case R.id.buttonCancel:
				Intent i = new Intent(NewUserActivity.this, MainActivity.class);
				startActivity(i);
				finish();
				break;

			case R.id.buttonRegister:

				userName = (EditText)findViewById(R.id.editUsername);
				userPassword = (EditText)findViewById(R.id.editPassword);
				userEmail = (EditText)findViewById(R.id.editEmail);

				String uname = userName.getText().toString();
				String pass = userPassword.getText().toString();
				String email = userEmail.getText().toString();
				boolean invalid = false;

				if(uname.equals("")){
					invalid = true;
					Toast.makeText(getApplicationContext(), "Username Missing", Toast.LENGTH_SHORT).show();
				}else if(pass.equals("")){
					invalid = true;
					Toast.makeText(getApplicationContext(), "Password Missing", Toast.LENGTH_SHORT).show();
				}else if(email.equals("")){
					invalid = true;
					Toast.makeText(getApplicationContext(), "Email ID Missing", Toast.LENGTH_SHORT).show();
				}

				if(invalid == false){

					Toast.makeText(getApplicationContext(), "Valid", Toast.LENGTH_SHORT).show();
				}

				break;
		}
	}

	

}
