package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
MiToastPersonalizado toast=new MiToastPersonalizado();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button miBoton;
        miBoton = (Button) findViewById(R.id.button);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast.mostrarMensaje(MainActivity.this, "Me hicieron clic");
            } });


}
}