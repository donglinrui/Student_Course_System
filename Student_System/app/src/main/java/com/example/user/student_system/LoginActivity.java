package com.example.user.student_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button_stulogin=(Button) findViewById(R.id.button_studentlogin);
        Button button_tchlogin=(Button) findViewById(R.id.button_teacherlogin);
        final Intent intent_stu= new Intent(LoginActivity.this,Pagestu.class);
        final Intent intent_tch= new Intent(LoginActivity.this,Pagetch.class);
        button_stulogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent_stu);
            }
        });
        button_tchlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent_tch);
            }
        });
    }
}
