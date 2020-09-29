package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
private EditText lado;
private TextView total, dato, tipo_op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        lado = findViewById(R.id.txtLado);
        total = findViewById(R.id.lblResultado);
        dato = findViewById(R.id.lblDato);
        tipo_op = findViewById(R.id.txtCuadrado);
    }
    public void calcular(View v){
        int ldo, area;
        ldo = Integer.parseInt(lado.getText().toString());
        area = ldo * ldo;
        total.setText(""+area);
    }
    public void limpiar(View v){
        lado.setText("");
        total.setText("");
        lado.requestFocus();
    }
    public void guardar(View v){
        String op, dt, res;
        Operacion d;
        op = tipo_op.getText().toString();
        dt = dato.getText().toString();
        res = total.getText().toString();
        d = new Operacion(op, dt,res);
        d.guardar();
        Toast.makeText(this, getString(R.string.area_guardada), Toast.LENGTH_LONG).show();

    }

}