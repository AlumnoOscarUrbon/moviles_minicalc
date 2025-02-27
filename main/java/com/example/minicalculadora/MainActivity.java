package com.example.minicalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumero1;
    private EditText edtNumero2;
    private Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero1 = (EditText) findViewById(R.id.edtNumero1);
        edtNumero2 = (EditText) findViewById(R.id.edtNumero2);
        btnSumar = (Button) findViewById(R.id.btnSumar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cadena1 = edtNumero1.getText().toString();
                String cadena2 = edtNumero2.getText().toString();
                int integer1 = Integer.parseInt(cadena1);
                int integer2 = Integer.parseInt(cadena2);
                int resultado = integer1 + integer2;

                Toast.makeText(MainActivity.this, "El resultado de mi amor por alicia es " + resultado, Toast.LENGTH_SHORT).show();

            }
        });
    }
}