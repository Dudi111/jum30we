package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etusername;
    private EditText etpassword;
    private EditText etemail;
    private Button mbtnlogin;
    private String emailvalid="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etemail=findViewById(R.id.etEmail);
        etusername=findViewById(R.id.etUsername);
        etpassword=findViewById(R.id.etPassword);
        mbtnlogin=findViewById(R.id.btnLogin);

        mbtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isemailvalid() && isusernamevalid() && ispasswordvalid()){
                    Intent intent=new Intent(MainActivity.this,NextActivity.class);
                    intent.putExtra("username",etusername.getText().toString());
                    startActivity(intent);
                }


            }
        });
    }
    private boolean isusernamevalid(){
        if(etusername.getText().toString().length()>=5){
            return true;
        }else{
            etusername.setError("Invalid username");
            return false;
        }
    }
    private boolean ispasswordvalid(){
        if(etpassword.getText().toString().length()>=6){
            return true;
        }else{
            etpassword.setError("Password length is small");
            return false;
        }
    }
    private boolean isemailvalid(){
        if(etemail.getText().toString().matches(emailvalid)){
            return true;
        }else{
            return false;
        }
    }
}