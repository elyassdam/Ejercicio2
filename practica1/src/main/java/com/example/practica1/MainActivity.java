package com.example.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private TextView txtResult;
    private Random random = new Random();
    private TextView bienvenida;


    private int num1;
    private int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("usuario")) {
            String usuario = intent.getStringExtra("usuario");
            bienvenida = findViewById(R.id.binvenida); // Asegúrate de que el TextView exista en el diseño XML
            bienvenida.setText("¡BIENVENIDO A QUIEN ES MAYOR, " + usuario + "!");
            btn1 = findViewById(R.id.btnNumber1);
            btn2 = findViewById(R.id.btnNumber2);
            txtResult = findViewById(R.id.txtResult);

            // Generar dos números aleatorios iniciales
            numerosAleatorios();

            // Establecer los números iniciales en los botones
            btn1.setText(String.valueOf(num1));
            btn2.setText(String.valueOf(num2));

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    comprobar(num1, num2);
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    comprobar(num1, num2);
                }
            });
        }


    }
        private void comprobar ( int selectedNumber, int otherNumber){
            if (selectedNumber > otherNumber) {
                txtResult.setText("Correcto");
                numerosAleatorios();
                btn1.setText(String.valueOf(num1));
                btn2.setText(String.valueOf(num2));
            } else {
                txtResult.setText("Incorrecto");
                // Aquí puedes manejar el caso de fallo
            }
        }
        public void numerosAleatorios() {
            num1 = random.nextInt(100); // Número aleatorio entre 0 y 99
            num2 = random.nextInt(100); // Número aleatorio entre 0 y 99
        }



}
