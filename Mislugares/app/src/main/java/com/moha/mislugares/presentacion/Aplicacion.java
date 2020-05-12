package com.moha.mislugares.presentacion;

import android.app.Application;

import com.moha.mislugares.datos.LugaresLista;
import com.moha.mislugares.datos.RepositoriosLugares;

public class Aplicacion extends Application {

    public RepositoriosLugares lugares = new LugaresLista();
    @Override public void onCreate() {
        super.onCreate();
    }

    public RepositoriosLugares getLugares() {
        return lugares;
    }
}