package com.notesApps.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity {

Button sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null)
        {

            Intent intent = new Intent(SplashActivity.this , MainActivity.class);
            startActivity(intent);
            finish();
        }

        FirebaseAuth.getInstance().sendPasswordResetEmail("a@a.com");

        sign_in = (Button) findViewById(R.id.signInBtn);

        sign_in.setOnClickListener(v->{
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
//            finish();

        });


        findViewById(R.id.signUpBtn).setOnClickListener(v->{
            Intent intent = new Intent(this,SignUpActivity.class);
            startActivity(intent);
//            finish();

        });

    }
}
