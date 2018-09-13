package com.example.mari_.mibici;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {
    ImageButton imageButtonLike;
    Button sizeSButton;
    Button sizeMButton;
    Button sizeLButton;
    Button sizeXLButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonLike = (ImageButton) findViewById(R.id.btn_like);
        sizeSButton = (Button) findViewById(R.id.btn_s_size);
        sizeMButton = (Button) findViewById(R.id.btn_m_size);
        sizeLButton = (Button) findViewById(R.id.btn_l_size);
        sizeXLButton = (Button) findViewById(R.id.btn_xl_size);

    }

    public void plusLike(View view){
        imageButtonLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "+1 Vintage Bicycle", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    
/*
    public void setSizeButton(View view){
        Button sizeButton = (Button) view;
        if(sizeButton.getId() == sizeSButton.getId()){
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeMButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeLButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeXLButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
        if(sizeButton.getId() == sizeMButton.getId()){
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeSButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeLButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeXLButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
        if(sizeButton.getId() == sizeLButton.getId()){
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeMButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeSButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeXLButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
        if(sizeButton.getId() == sizeXLButton.getId()){
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeMButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeLButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeSButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
    }*/
}
