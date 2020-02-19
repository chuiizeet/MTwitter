package com.jegulabs.mtwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSignUp;
    TextView tvGoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        btnSignUp = findViewById(R.id.buttonSignUp);
        tvGoLogin = findViewById(R.id.textViewGoSignIn);

        btnSignUp.setOnClickListener(this);
        tvGoLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.buttonSignUp:
                break;
            case R.id.textViewGoSignIn:
                goToSignIn();
                break;
        }

    }

    private void goToSignIn() {

        Intent i = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(i);
    }
}
