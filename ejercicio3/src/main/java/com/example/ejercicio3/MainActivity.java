package com.example.ejercicio3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.ejercicio3.R;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    ImageView miImagen;
    RadioGroup miRadioG;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.Opcion);
        rb1 = (RadioButton) findViewById(R.id.agua);
        rb2 = (RadioButton) findViewById(R.id.tierra);
        rb3=(RadioButton)findViewById(R.id.aire);
        miImagen=(ImageView)findViewById(R.id.miImagen);
        miRadioG = (RadioGroup) findViewById(R.id.radioGroup);

        miRadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == rb1.getId()) {
// Lógica para el caso Id1
                    miImagen.setImageResource(R.drawable.agua);
                } else if (checkedId == rb2.getId()) {
// Lógica para el caso Id2
                    miImagen.setImageResource(R.drawable.tierra);
                } else if (checkedId == rb3.getId()) {
// Lógica para el caso Id3
                    miImagen.setImageResource(R.drawable.aire);
                }
            }
        });




    }


}
