package com.example.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
        private EditText usuarioEditText;
        private Button loginButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login);

            usuarioEditText = findViewById(R.id.usernameEditText);
            loginButton = findViewById(R.id.comenzar);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String usuario = usuarioEditText.getText().toString();

                    if (usuarioValido(usuario)) {
                        // Después de verificar que el nombre de usuario es válido


                        // El nombre de usuario es válido, inicia la siguiente actividad
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        intent.putExtra("usuario",usuario);
                        startActivity(intent);
                    } else {
                        // Muestra un mensaje de error
                        Toast.makeText(Login.this, "Nombre de usuario no válido", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }

        private boolean usuarioValido(String username) {

                return username.length() <= 8;
            }
        }

