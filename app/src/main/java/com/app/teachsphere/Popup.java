package com.app.teachsphere;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Popup extends AppCompatActivity {
    Button popupBTN;
    Dialog mDialog;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popupBTN = findViewById(R.id.imageView3);
        mDialog = new Dialog(this);

        popupBTN.setOnClickListener(v -> {

            mDialog.setContentView(R.layout.pop_up_centang);
            mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        });
    }
}
