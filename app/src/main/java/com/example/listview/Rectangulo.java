package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {
    private EditText base, altura;
    private TextView total, dato, tipo_op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        base = findViewById(R.id.txtLado);
        altura = findViewById(R.id.txtAltura);
        total = findViewById(R.id.lblResultado);
        dato = findViewById(R.id.lblDato);
        tipo_op = findViewById(R.id.txtRectangulo);
    }
    public void calcular(View v){
        int b, h, area;
        b = Integer.parseInt(base.getText().toString());
        h = Integer.parseInt(altura.getText().toString());
        area = b * h;
        total.setText(""+area);
    }
    public void limpiar(View v){
        base.setText("");
        altura.setText("");
        total.setText("");
        base.requestFocus();
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