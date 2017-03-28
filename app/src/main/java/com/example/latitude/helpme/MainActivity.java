package com.example.latitude.helpme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button loginButton = (Button) findViewById(R.id.inscription);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, page_Inscr1.class);
                startActivity(intent);
            }
        });

    }

    public void goToThePageLogin7(View view) {
        Intent intent = new Intent(this, page7_connexion.class);
        startActivity(intent);

    }

}