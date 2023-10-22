package com.example.ejercicio2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MiToastPersonalizado {

        public static void mostrarMensaje(Context context, String mensaje) {
// Inflar el diseño personalizado
            View view = LayoutInflater.from(context).inflate(R.layout.activity_main,null);
            // Buscar el TextView en la vista inflada
            TextView text = view.findViewById(R.id.textomuestra);


            // Configurar el texto del Toast
            text.setText(mensaje);

            // Crear y mostrar el Toast personalizado
            Toast toast = new Toast(context);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(view); // Usar la vista "view", no "layout"
            toast.show();
        }
    }

