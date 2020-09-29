package com.example.listview;

public class AreaCuadrado {
    private String operacion;
    private String dato;
    private String lado;

    public AreaCuadrado(String operacion, String dato, String lado) {
        this.operacion = operacion;
        this.dato = dato;
        this.lado = lado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }
    public void guardarAC(){
        Datos.guardarAC(this);
    }
}
