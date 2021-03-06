package com.jegulabs.mtwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;
    TextView tvGoSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin = findViewById(R.id.buttonSignIn);
        tvGoSignUp = findViewById(R.id.textViewGoSignIn);


        btnLogin.setOnClickListener(this);
        tvGoSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.buttonSignIn:
                break;
            case R.id.textViewGoSignIn:
                goToSignUp();
                break;
        }

    }

    private void goToSignUp() {

        Intent i = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(i);
    }
}
