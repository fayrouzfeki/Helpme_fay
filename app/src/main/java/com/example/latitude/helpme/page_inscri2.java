package com.example.latitude.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class page_inscri2 extends AppCompatActivity {

    Spinner spinner1;
    ArrayAdapter<CharSequence> adapter1;

    Spinner spinner2;
    ArrayAdapter<CharSequence> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_inscri2);

        spinner1 = (Spinner)findViewById(R.id.ville);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.country_names, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);



        spinner2 = (Spinner)findViewById(R.id.groupe_sanguin);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.groupe_sanguin, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        final Button loginButton = (Button) findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_inscri2.this, page_Inscri3.class);
                startActivity(intent);
            }
        });
    }
}
