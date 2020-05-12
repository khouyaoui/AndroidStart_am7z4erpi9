package com.moha.mislugares.modelo;

import com.moha.mislugares.R;

public enum TipoLugar {
    OTROS ("Otros", R.drawable.otros),
    RESTAURANTE ("Restaurante", R.drawable.restaurante),
    BAR ("Bar", R.drawable.bar),
    COPAS ("Copas", 0),
    ESPECTACULO ("Espectáculo", 0),
    HOTEL ("Hotel", 0),
    COMPRAS ("Compras", 0),
    EDUCACION ("Educación", 0),
    DEPORTE ("Deporte", 0),
    NATURALEZA ("Naturaleza", 0),
    GASOLINERA ("Gasolinera", 0);

    private final String texto;
    private final int recurso;

    TipoLugar(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() { return texto; }
    public int getRecurso() { return recurso; }


}
