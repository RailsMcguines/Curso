package com.maxi.android.curso.entity;

import java.util.ArrayList;
import java.util.List;

public class Icono {

    private String nobmre;
    private String xml;
    private int icon;

    public Icono(String nobmre, String xml, int icon) {
        this.nobmre = nobmre;
        this.xml = xml;
        this.icon = icon;
    }

    public String getNobmre() {
        return nobmre;
    }

    public void setNobmre(String nobmre) {
        this.nobmre = nobmre;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public static List<Icono> getList() {
        List<Icono> iconos = new ArrayList<>();
        Icono icono = new Icono("Speak Now","@android:drawable/ic_btn_speak_now",
                android.R.drawable.ic_btn_speak_now);
        iconos.add(icono);
        icono = new Icono("Delete","@android:drawable/ic_delete",
                android.R.drawable.ic_delete);
        iconos.add(icono);
        icono = new Icono("Alert","@android:drawable/ic_dialog_alert",
                android.R.drawable.ic_dialog_alert);
        iconos.add(icono);
        icono = new Icono("Email","@android:drawable/ic_dialog_email",
                android.R.drawable.ic_dialog_email);
        iconos.add(icono);
        icono = new Icono("Info","@android:drawable/ic_btn_speak_now",
                android.R.drawable.ic_dialog_info);
        iconos.add(icono);
        icono = new Icono("Map","@android:drawable/ic_dialog_map",
                android.R.drawable.ic_dialog_map);
        iconos.add(icono);
        icono = new Icono("Add","@android:drawable/ic_input_add",
                android.R.drawable.ic_input_add);
        iconos.add(icono);
        icono = new Icono("Play","@android:drawable/ic_media_play",
                android.R.drawable.ic_media_play);
        iconos.add(icono);
        icono = new Icono("Agenda","@android:drawable/ic_menu_agenda",
                android.R.drawable.ic_menu_agenda);
        iconos.add(icono);
        icono = new Icono("Help","@android:drawable/ic_menu_help",
                android.R.drawable.ic_menu_help);
        iconos.add(icono);
        icono = new Icono("Search","@android:drawable/ic_menu_search",
                android.R.drawable.ic_menu_search);
        iconos.add(icono);
        icono = new Icono("Call","@android:drawable/ic_menu_call",
                android.R.drawable.ic_menu_call);
        iconos.add(icono);

        return iconos;
    }
}
