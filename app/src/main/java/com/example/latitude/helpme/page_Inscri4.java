package com.example.latitude.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page_Inscri4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page__inscri4);


    }

    public  void goToTheEmprint(View view){
        Intent intent = new Intent(this,EmpreintActivity.class);
        startActivity(intent);

    }
    public  void goToTheSchema (View view){
        Intent intent =new Intent(this,SchemaActivity.class);
        startActivity(intent);


    }
}
