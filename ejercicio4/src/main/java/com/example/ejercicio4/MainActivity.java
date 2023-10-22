package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton miBoton;
ImageView miImagen;
Switch onoff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miBoton = (ToggleButton) findViewById(R.id.botonToggle);
        miImagen = (ImageView) findViewById(R.id.miImagen);
        onoff=(Switch)findViewById(R.id.OnOFF);

        miBoton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked() == true) {
// Lógica para el caso Id1
                    miImagen.setImageResource(R.drawable.abierto);
                } else if(buttonView.isChecked()==false){
                    miImagen.setImageResource(R.drawable.cerrado);
                }
            }



        });
    onoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (buttonView.isChecked() == true) {
// Lógica para el caso Id1
                miImagen.setImageResource(R.drawable.abierto);
            } else if(buttonView.isChecked()==false){
                miImagen.setImageResource(R.drawable.cerrado);
            }
        }
    });

    }
}
