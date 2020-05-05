package com.moha.mislugares.presentacion;

import android.app.Application;

import com.moha.mislugares.datos.LugaresLista;
import com.moha.mislugares.datos.RepositorioLugares;

public class Aplicacion extends Application {

    public RepositorioLugares lugares = new LugaresLista();
    @Override public void onCreate() {
        super.onCreate();
    }

    public RepositorioLugares getLugares() {
        return lugares;
    }
}