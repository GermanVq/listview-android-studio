package com.example.listview;

public class Area {
    private Double altura;
    private Double base;
    private Double lado;

    public Area(Double altura, Double base, Double lado) {
        this.altura = altura;
        this.base = base;
        this.lado = lado;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
