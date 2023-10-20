package ejercicio3;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejercicio2.R;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej3_activity_main);
        tv1 = (TextView) findViewById(R.id.Opcion);
        rb1 = (RadioButton) findViewById(R.id.aire);
        rb2 = (RadioButton) findViewById(R.id.tierra);
        rb3=(RadioButton)findViewById(R.id.agua);
        dioGroup.
                miRadioG = (RadioGroup) findViewById(R.id.radioGroup);
        miImagen = (ImageView) findViewById(R.id.imageView);
        miRadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.Id1) {
// Lógica para el caso Id1
                    miImagen.setImageResource(R.drawable.aire);
                } else if (checkedId == R.id.id2) {
// Lógica para el caso Id2
                    miImagen.setImageResource(R.drawable.tierra);
                } else if (checkedId == R.id.id3) {
// Lógica para el caso Id3
                    miImagen.setImageResource(R.drawable.agua);
                }
            }
        });




    }


}
