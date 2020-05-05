package com.moha.mislugares;

import android.app.Application;

public class Aplicacion extends Application {

    public RepositorioLugares lugares = new LugaresLista();
    @Override public void onCreate() {
        super.onCreate();
    }

    public RepositorioLugares getLugares() {
        return lugares;
    }
}