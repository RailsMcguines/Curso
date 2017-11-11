package com.maxi.android.curso.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maxi.android.curso.R;
import com.maxi.android.curso.fragment.DetalleFragment;

public class DetalleActivity extends AppCompatActivity {

    public static final String ICONO_KEY = "Icono";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        DetalleFragment detalle = (DetalleFragment)getSupportFragmentManager()
                        .findFragmentById(R.id.fgmDetalle);

        detalle.mostrarDetalle(getIntent().getSerializableExtra(ICONO_KEY));
    }
}
