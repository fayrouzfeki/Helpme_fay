package com.example.latitude.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page_Inscr1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page__inscr1);
    }
    public  void goToTheInri2(View view){
        Intent intent = new Intent(this, page_inscri2.class);
        startActivity(intent);

    }
}
