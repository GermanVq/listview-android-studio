package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaOperacion extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<AreaCuadrado> areaCuadrados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_operacion);
        tabla = findViewById(R.id.tblOpercaciones);
        areaCuadrados = Datos.obtenerAC();

        for (int i = 0; i < areaCuadrados.size(); i++) {
            TableRow fila = new TableRow(this);

            TextView columna_uno = new TextView(this);
            TextView columna_dos = new TextView(this);
            TextView columna_tres = new TextView(this);
            TextView columna_cuatro = new TextView(this);

            columna_uno.setText(""+(i+1));
            columna_dos.setText(areaCuadrados.get(i).getOperacion());
            columna_tres.setText(areaCuadrados.get(i).getDato());
            columna_cuatro.setText(areaCuadrados.get(i).getLado());

            fila.addView(columna_uno);
            fila.addView(columna_dos);
            fila.addView(columna_tres);
            fila.addView(columna_cuatro);

            tabla.addView(fila);
        }
    }
}