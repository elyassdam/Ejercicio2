package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button miBoton;
        miBoton = (Button) findViewById(R.id.button);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Me hicieron clic", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public class MiToastPersonalizado {


        public  void mostrarMensaje(Context context, String message) {
// Inflar el diseño personalizado
            View view = LayoutInflater.from(context).inflate(R.layout.activity_main, null);
            // Crear y mostrar el Toast personalizado
            Toast toast = new Toast(context);
            toast.setView(view);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();

        }
    }
}