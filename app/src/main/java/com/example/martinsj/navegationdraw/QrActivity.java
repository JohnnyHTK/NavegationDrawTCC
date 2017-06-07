package com.example.martinsj.navegationdraw;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by jonat on 07/06/2017.
 */

public class QrActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       //Classe QR ACTIVITY
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        imageView = (ImageView) this.findViewById(R.id.imageView);
        Bitmap bitmap = getIntent().getParcelableExtra("pic");
        imageView.setImageBitmap(bitmap);
    }
}
