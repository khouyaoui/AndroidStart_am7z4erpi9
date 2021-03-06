package com.moha.mislugares.presentacion;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.moha.mislugares.R;
import com.moha.mislugares.caso_uso.CasosUsoLugar;
import com.moha.mislugares.datos.RepositoriosLugares;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

private Button bAcercaDe;
private Button bPreferencias;
private Button bSalir;


private RepositoriosLugares lugares;
private CasosUsoLugar usoLugar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAcercaDe = findViewById(R.id.B3_acerca);
        bAcercaDe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                lanzarAcercaDe(null);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        bSalir = findViewById(R.id.B4_salir);
        bSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bPreferencias = findViewById(R.id.B2_preferencias);
        bPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarPreferencias(null);
            }
        });

        lugares = new Aplicacion().getLugares();
        usoLugar = new CasosUsoLugar(this, lugares);

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;   // menu visible
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            lanzarPreferencias(null);
            return true;
        }
        if (id == R.id.acercaDe){
            lanzarAcercaDe(null);
            return true;
        }
        if(id == R.id.menu_buscar){
            lanzarVistaLugar(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void lanzarAcercaDe(View view){
        Intent intent = new Intent(this, AcercaDeActivity.class);
        startActivity(intent);
    }

    public void lanzarPreferencias(View view){
        Intent intent = new Intent(this, PrefereciasActivity.class);
        startActivity(intent);
    }
    /*public void bSalir (View view){
            finish();
    }*/

    public void lanzarVistaLugar(View view){
            final EditText entrada = new EditText(this);
            entrada.setText("0");
            new AlertDialog.Builder(this)
                    .setTitle("Selección de lugar")
                    .setMessage("indica su id:")
                    .setView(entrada)
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            int id = Integer.parseInt (entrada.getText().toString());
                            usoLugar.mostrar(id);
                        }})
                    .setNegativeButton("Cancelar", null)
                    .show();

     }
}
