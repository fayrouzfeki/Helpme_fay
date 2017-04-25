package com.example.latitude.helpme;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by ASUS on 25/04/2017.
 */

public class CameraActivity extends AppCompatActivity {

    private static final int ACTIVITY_START_CAMERA_APP=0;
    private ImageView mPhotoCapturedImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        mPhotoCapturedImageView = (ImageView) findViewById(R.id.capturePhotoImageView);
    }

    public void prendrePhoto (View view) {
        Toast.makeText(this, "camera button pressed", Toast.LENGTH_SHORT).show();
        Intent callCameraApplicationIntent = new Intent();
        callCameraApplicationIntent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(callCameraApplicationIntent, ACTIVITY_START_CAMERA_APP );
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode== ACTIVITY_START_CAMERA_APP && resultCode == RESULT_OK){
            Toast.makeText(this, "Picture taken successfully", Toast.LENGTH_SHORT).show();
            Bundle extras = data.getExtras();
            Bitmap photoCapturedBitmap = (Bitmap) extras.get("data");
            mPhotoCapturedImageView.setImageBitmap(photoCapturedBitmap);
        }
    }

}
