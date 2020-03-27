package com.aie.notification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.aie.notification.SignUpActivity.CHANNEL_ID;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();
        String send_name = intent.getStringExtra(SignUpActivity.CHANNEL_ID);

        TextView textView = findViewById(R.id.reg_name);
        textView.setText(send_name);
    }
}
