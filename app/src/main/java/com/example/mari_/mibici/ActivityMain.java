package com.example.mari_.mibici;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
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
    Button addedToCar;
    boolean added = false;
    int size = 0;
    private final String KEY_ADD_BUTTON = "add_button_flag";
    private final String KEY_SIZE_BUTTON="size_button_flag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonLike = (ImageButton) findViewById(R.id.btn_like);
        sizeSButton = (Button) findViewById(R.id.btn_s_size);
        sizeMButton = (Button) findViewById(R.id.btn_m_size);
        sizeLButton = (Button) findViewById(R.id.btn_l_size);
        sizeXLButton = (Button) findViewById(R.id.btn_xl_size);
        addedToCar = (Button) findViewById(R.id.btn_add_car);

        if(savedInstanceState != null){
            added = savedInstanceState.getBoolean(KEY_ADD_BUTTON);
            size = savedInstanceState.getInt(KEY_SIZE_BUTTON);
            if(added){
                setAddToCar(addedToCar);
            }else{
                takeOutOfCar(addedToCar);
            }
            recoverSizeButton(size);
        } else{
            added = false;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putBoolean(KEY_ADD_BUTTON, added);
        outState.putInt(KEY_SIZE_BUTTON, size);
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

    public void addToCar(final View view){
        if(added){
            alreadyAddedToCar(view);
        }else if (!added){
            added = true;
            setAddToCar(view);
            String addedToCar = getResources().getString(R.string.added_to_car);
            Snackbar snackbar = Snackbar.make(view, addedToCar, Snackbar.LENGTH_INDEFINITE)
                    .setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String takeOutOfCar = getResources().getString(R.string.ok_no_more);
                            Snackbar snackbar = Snackbar.make(v, takeOutOfCar, Snackbar.LENGTH_LONG);
                            snackbar.show();
                            takeOutOfCar(v);
                            added = false;
                        }
                    });
            snackbar.show();
        }
    }

    public void takeOutOfCar(View view){
        String addToCar = getResources().getString(R.string.btn_car);
        addedToCar.setText(addToCar);
    }

    public void setAddToCar(View view){
        String itemAddedToCar = getResources().getString(R.string.item_already_added);
        addedToCar.setText(itemAddedToCar);
    }

    public void alreadyAddedToCar(View view){
        String itemAddedToCar = getResources().getString(R.string.item_already_added);
        Snackbar snackbar = Snackbar.make(view, itemAddedToCar, Snackbar.LENGTH_INDEFINITE)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String takeOutOfCar = getResources().getString(R.string.ok_no_more);
                        Snackbar snackbar = Snackbar.make(v, takeOutOfCar, Snackbar.LENGTH_LONG);
                        snackbar.show();
                        takeOutOfCar(v);
                        added = false;
                    }
                });
        snackbar.show();
    }

    public void recoverSizeButton(int size){
        if(size == 1){
            setSizeButton(sizeSButton);
        }else if(size == 2){
            setSizeButton(sizeMButton);
        } else if(size == 3){
            setSizeButton(sizeLButton);
        } else if(size == 4){
            setSizeButton(sizeXLButton);
        }
    }

    public void setSizeButton(View view){
        Button sizeButton = (Button) view;
        sizeButton.setTextColor(getResources().getColor(R.color.colorWhite));
        if(sizeButton.getId() == sizeSButton.getId()){
            size = 1;
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeMButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeLButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeXLButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeMButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeLButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeXLButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
        if(sizeButton.getId() == sizeMButton.getId()){
            size = 2;
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeSButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeLButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeXLButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeSButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeLButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeXLButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
        if(sizeButton.getId() == sizeLButton.getId()){
            size = 3;
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeMButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeSButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeXLButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeMButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeSButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeXLButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
        if(sizeButton.getId() == sizeXLButton.getId()){
            size = 4;
            sizeButton.setBackgroundResource(R.color.colorPrimary);
            sizeMButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeLButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeSButton.setTextColor(getColor(R.color.colorPrimaryDark));
            sizeMButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeLButton.setBackgroundResource(R.drawable.btn_border_settings);
            sizeSButton.setBackgroundResource(R.drawable.btn_border_settings);
        }
    }
}
