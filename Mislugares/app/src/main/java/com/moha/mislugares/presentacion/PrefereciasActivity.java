package com.moha.mislugares.presentacion;

import android.app.Activity;
import android.os.Bundle;

public class PrefereciasActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PreferenciasFragment())
                .commit(); // commit para se ejecute el fragment

    }
}
