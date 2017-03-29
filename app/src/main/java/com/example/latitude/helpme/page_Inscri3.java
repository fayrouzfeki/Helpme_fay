package com.example.latitude.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_Inscri3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page__inscri3);
        final Button loginButton = (Button) findViewById(R.id.btn_Envoyer);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_Inscri3.this, page_Inscri4.class);
                startActivity(intent);
            }
        });
    }
}
