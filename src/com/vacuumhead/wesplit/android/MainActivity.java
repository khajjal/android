package com.vacuumhead.wesplit.android;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.we_split.R;

public class MainActivity<DbHelper> extends Activity implements OnClickListener {
    
	Button userLogin;EditText userName;Button newUser;EditText userPassword;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        newUser = (Button)findViewById(R.id.buttonNewUser);
        userLogin = (Button)findViewById(R.id.buttonLogin);
        newUser.setOnClickListener(this);
        userLogin.setOnClickListener(this);
        
    }
    
	public void onClick(View v) {

		switch(v.getId()){

		case R.id.buttonLogin:
			userName = (EditText)findViewById(R.id.editUsername);
			userPassword = (EditText)findViewById(R.id.editPassword);

			String uname = userName.getText().toString();
			String pass = userPassword.getText().toString();

			if(uname.equals("") || uname == null){
				Toast.makeText(getApplicationContext(), "Username Empty", Toast.LENGTH_SHORT).show();
			}else if(pass.equals("") || pass == null){
				Toast.makeText(getApplicationContext(), "Password Empty", Toast.LENGTH_SHORT).show();
			}else{
				//Intent for valid conditions
				}
			
			break;

		case R.id.buttonNewUser:
			Intent i = new Intent(MainActivity.this, NewUserActivity.class);
			startActivity(i);
			finish();
			break;

		}
	}

	}