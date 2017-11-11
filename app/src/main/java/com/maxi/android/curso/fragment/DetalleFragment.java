package com.maxi.android.curso.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.maxi.android.curso.R;
import com.maxi.android.curso.entity.Icono;

import java.io.Serializable;

public class DetalleFragment extends Fragment {

    private TextView tvNombre;
    private ImageView ivIcono;

    public DetalleFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle, container, false);
    }

    public void mostrarDetalle(Serializable icono) {
        Icono ic = (Icono) icono;
        tvNombre = (TextView) getView().findViewById(R.id.tvNombre);
        ivIcono = (ImageView) getView().findViewById(R.id.ivIcono);

        tvNombre.setText(ic.getNobmre());
        ivIcono.setBackgroundResource(ic.getIcon());
    }
}
