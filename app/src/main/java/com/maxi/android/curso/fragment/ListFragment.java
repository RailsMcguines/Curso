package com.maxi.android.curso.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.maxi.android.curso.R;
import com.maxi.android.curso.adapter.CustomListViewAdapter;
import com.maxi.android.curso.entity.Icono;
import com.maxi.android.curso.interfaces.IconosListener;

public class ListFragment extends Fragment {

    private ListView lvLista;

    private IconosListener listener;

    public ListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lvLista = (ListView) getView().findViewById(R.id.lvLista);

        ArrayAdapter adapter = new CustomListViewAdapter(getContext(), R.layout.adapter_custom_listview_row, Icono.getList());

        lvLista.setAdapter(adapter);

        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (listener!=null) {
                    listener.onIconoSeleccionado(
                            (Icono)lvLista.getAdapter().getItem(position));
                }
            }
        });
    }

    public void setIconosListener(IconosListener listener) {
        this.listener = listener;
    }
}
