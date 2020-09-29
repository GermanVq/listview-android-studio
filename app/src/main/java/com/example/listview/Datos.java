package com.example.listview;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<AreaCuadrado> areas = new ArrayList();
    private static ArrayList<Volumen> volumenes = new ArrayList();


    public static void guardarAC(AreaCuadrado c){ areas.add(c); }

    public static ArrayList<AreaCuadrado> obtenerAC(){
        return areas;
    }

    public static void guardarV(Volumen p){ volumenes.add(p); }

    public static ArrayList<Volumen> obtenerV(){ return volumenes; }
}
