package com.moha.mislugares.datos;
import com.moha.mislugares.modelo.Lugar;
import com.moha.mislugares.modelo.TipoLugar;

import java.util.ArrayList;
import java.util.List;

public class LugaresLista implements RepositoriosLugares {
    protected List <Lugar> listaLugares;

    public LugaresLista() {
        listaLugares = new ArrayList<Lugar>();
        anyadeEjemplos();
    }


    public Lugar elemento(int id) {
        return listaLugares.get(id);
    }

    public void anyade(Lugar lugar) {
        listaLugares.add(lugar);
    }


    public int nuevo() {
        Lugar lugar = new Lugar();
        listaLugares.add(lugar);
        return listaLugares.size()-1;
    }

    public void borrar(int id) {
        listaLugares.remove(id);
    }

    @Override
    public int tamanyo() {
        return listaLugares.size();
    }

    public int tamaño() {
        return listaLugares.size();
    }
    public void actualiza(int id, Lugar lugar) {
        listaLugares.set(id, lugar);
    }

    public void anyadeEjemplos() {
        anyade(new Lugar("Escuela Politécnica Superior de Gandía",
                        "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es", "Uno de los mejores lugares para formarse.",
                3, TipoLugar.EDUCACION));
        anyade(new Lugar("Al de siempre",
                        "P.Industrial Junto Molí Nou - 46722, Benifla (Valencia)",
                        -0.190642, 38.925857, 636472405, "", "No te pierdas el arroz en calabaza.",
                3, TipoLugar.BAR));
        anyade(new Lugar("androidcurso.com",
                        "ciberespacio", 0.0, 0.0, 962849300,
                "http://androidcurso.com", "Amplia tus conocimientos sobre Android.",
                5, TipoLugar.EDUCACION));
        anyade(new Lugar("Barranco del Infierno",
                        "Vía Verde del río Serpis. Villalonga (Valencia)",
                        -0.295058, 38.867180, 0, "http://sosegaos.blogspot.com.es/2009/02/lorcha-villalonga-via-"+
                                "verde-del-rio.html",
                "Espectacular ruta para bici o andar", 4, TipoLugar.NATURALEZA));
        anyade(new Lugar("La Vital",
                        "Avda. de La Vital, 0 46701 Gandía (Valencia)", -0.1720092,
                        38.9705949, 962881070, "http://www.lavital.es/",
                "El típico centro comercial", 2, TipoLugar.COMPRAS));

    }


}
