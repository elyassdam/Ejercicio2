package com.example.ejercicio5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
ImageButton llamada;
boolean llamadaCurso=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llamada=(ImageButton)findViewById(R.id.idBoton);
        llamada.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(llamadaCurso==false){
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Me has pulsado").setMessage("¿Quieres llamar?")
                            .setPositiveButton("SI,PORFA ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int id) {
                            llamada.setImageResource(R.drawable.colgar);
                            llamadaCurso = true;
                            Toast.makeText(MainActivity.this, "Estoy llamando.Pulsa el rojo para colgar", Toast.LENGTH_SHORT).show();
                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "Ok Operacion cancelada", Toast.LENGTH_SHORT).show();
                        }
                    });
                    AlertDialog dialog=builder.create();
                    dialog.show();
                    }
                else{
                    llamada.setImageResource(R.drawable.descolgar);
llamadaCurso=false;
                    }

                }
            });
    }
}