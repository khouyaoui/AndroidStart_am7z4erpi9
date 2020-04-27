package com.moha.masvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      }

    public void sePulsa0(View view){
        Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
    }

public void sePulsa(View view){

    salida.setText(String.valueOf(Float.parseFloat(
            entrada.getText().toString()) * 2.0));
}
}
