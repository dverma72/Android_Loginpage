package com.apnd.administrator.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
TextView txtmsg, txtuser, txtpass;
EditText etuser, edpass ;
Button btnlogin,btncreate ,btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        txtmsg = (TextView) findViewById(R.id.txtmsg);
        txtuser = (TextView) findViewById(R.id.txtuser);
        txtpass = (TextView) findViewById(R.id.txtpass);
        etuser = (EditText) findViewById(R.id.etuser);
        edpass = (EditText) findViewById(R.id.edpass);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btncreate = (Button) findViewById(R.id.btncreate);
    }
        protected void onclick(View v){
        if (v==btnlogin)
        {
            String username, password;
            username=etuser.getText().toString();
            password=etuser.getText().toString();
            if(username.equals("Admin")&&password.equals("123")) {
                Intent intent = new Intent(this, create.class);
                intent.putExtra("User", username);
                startActivity(intent);
            }
            else {
                txtmsg.setText("Invalid");
            }

            if(v==btnexit)
        {
            finish();

        }

        }
    }
}
