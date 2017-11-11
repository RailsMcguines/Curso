package com.maxi.android.curso.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maxi.android.curso.entity.Icono;
import com.maxi.android.curso.R;

import java.util.List;

public class CustomListViewAdapter extends ArrayAdapter<Icono>{

    private Context context;
    private int resource;
    private List<Icono> iconos;

    private ImageView icon;
    private TextView nombre;
    private TextView xml;
    private TextView index;

    public CustomListViewAdapter(Context context, int resource, List<Icono> iconos) {
        super(context, resource, iconos);
        this.context = context;
        this.resource = resource;
        this.iconos = iconos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, parent, false);

        icon = (ImageView) rowView.findViewById(R.id.imageView);
        nombre = (TextView) rowView.findViewById(R.id.tvNombre);
        xml = (TextView) rowView.findViewById(R.id.tvXml);
        index = (TextView) rowView.findViewById(R.id.tvIndex);

        icon.setBackgroundResource(iconos.get(position).getIcon());
        nombre.setText(iconos.get(position).getNobmre());
        xml.setText(iconos.get(position).getXml());
        index.setText(Integer.toString(position));

        return rowView;
    }
}
