package com.example.anslo.mwanafunzicare;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Paul Mburu on 11/4/18.
 */

public class ActivityStudentLogin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        Button staffOptionButton=(Button)findViewById(R.id.staff_option_button);
        staffOptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ActivityStudentLogin.this,ActivityStaffLogin.class);
                startActivity(i);
            }
        });

        Button buttonLogin=(Button)findViewById(R.id.button_student_login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ActivityStudentLogin.this,ActivityChoice.class);
                startActivity(i);
            }
        });
    }
}
