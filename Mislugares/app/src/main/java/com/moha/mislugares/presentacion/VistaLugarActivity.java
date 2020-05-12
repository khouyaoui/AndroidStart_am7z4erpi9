package com.moha.mislugares.presentacion;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.moha.mislugares.R;
import androidx.appcompat.app.AppCompatActivity;
import com.moha.mislugares.caso_uso.CasosUsoLugar;
import com.moha.mislugares.datos.RepositoriosLugares;
import com.moha.mislugares.modelo.Lugar;

import java.text.DateFormat;
import java.util.Date;
public class VistaLugarActivity extends AppCompatActivity {
    private RepositoriosLugares lugares;
    private CasosUsoLugar usoLugar;
    private int pos;
    private Lugar lugar;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(findViewById(R.id.vista_lugar));
        Bundle extras = getIntent().getExtras();
        pos = extras.getInt("pos", 0);
        lugares = ((Aplicacion) getApplication()).lugares;
        usoLugar = new CasosUsoLugar(this, lugares);
        lugar = lugares.elemento(pos);
        actualizaVistas(pos);
    }

    public void actualizaVistas(int pos) {
        TextView nombre = findViewById(R.id.nombre);
        nombre.setText(lugar.getNombre());
        ImageView logo_tipo = findViewById(R.id.logo_tipo);
        logo_tipo.setImageResource(lugar.getTipo().getRecurso());
        @SuppressLint("WrongViewCast") TextView tipo = findViewById(R.id.tipo);
        tipo.setText(lugar.getTipo().getTexto());
        TextView direccion = findViewById(R.id.direccion);
        direccion.setText(lugar.getDireccion());

        if (lugar.getTelefono() == 0) {
            findViewById(R.id.telefono).setVisibility(View.GONE);
        } else {
            findViewById(R.id.telefono).setVisibility(View.VISIBLE);    // si el campo esta vacío, ocultalo
            TextView telefono = findViewById(R.id.telefono);            // same para todos los campos
            telefono.setText(Integer.toString(lugar.getTelefono()));
        }
        
        TextView url = findViewById(R.id.url);
        url.setText(lugar.getUrl());
        TextView comentario = findViewById(R.id.comentario);
        comentario.setText(lugar.getComentario());
        TextView fecha = findViewById(R.id.fecha);
        fecha.setText(DateFormat.getDateInstance().format(
                new Date(lugar.getFecha())));
        TextView hora = findViewById(R.id.hora);
        hora.setText(DateFormat.getTimeInstance().format(
                new Date(lugar.getFecha())));
        RatingBar valoracion = findViewById(R.id.valoracion);
        valoracion.setRating(lugar.getValoracion());
        valoracion.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override public void onRatingChanged(RatingBar ratingBar, float valor, boolean fromUser) {
                        lugar.setValoracion(valor);
                    }
                });
    }
}