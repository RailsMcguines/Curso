package com.maxi.android.curso.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maxi.android.curso.R;
import com.maxi.android.curso.entity.Icono;
import com.maxi.android.curso.fragment.DetalleFragment;
import com.maxi.android.curso.fragment.ListFragment;
import com.maxi.android.curso.interfaces.IconosListener;

public class ListActivity extends AppCompatActivity implements IconosListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListFragment listFragment = (ListFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fgmList);

        listFragment.setIconosListener(this);
    }

    @Override
    public void onIconoSeleccionado(Icono icono) {
        boolean hayDetalle =
                (getSupportFragmentManager().findFragmentById(R.id.fgmDetalle) != null);

        if(hayDetalle) {
            ((DetalleFragment)getSupportFragmentManager()
                    .findFragmentById(R.id.fgmDetalle)).mostrarDetalle(icono);
        }
        else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.ICONO_KEY, icono);
            startActivity(i);
        }
    }
}
