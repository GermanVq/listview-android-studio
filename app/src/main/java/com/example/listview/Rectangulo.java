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
        if(Validar()) {

            b = Integer.parseInt(base.getText().toString());
            h = Integer.parseInt(altura.getText().toString());
            area = b * h;
            total.setText("" + area);
        }
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

        if(ValidarG()) {
            op = getString(R.string.area)+" "+tipo_op.getText().toString();
            dt = getString(R.string.altura)+ ": " + altura.getText().toString() +"\n"+
                    getString(R.string.base)+ ": " + base.getText().toString();
            res = total.getText().toString();
            d = new Operacion(op, dt, res);
            d.guardar();
            Toast.makeText(this, getString(R.string.area_guardada), Toast.LENGTH_LONG).show();
        }
    }
    public boolean Validar(){
        if(base.getText().toString().isEmpty()){
            Toast.makeText(this, getString(R.string.error_calcular), Toast.LENGTH_LONG).show();
            return false;
        }
        if(altura.getText().toString().isEmpty()){
            Toast.makeText(this, getString(R.string.error_calcular), Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
    public boolean ValidarG(){
        if(base.getText().toString().isEmpty()){
            Toast.makeText(this, getString(R.string.error_guardar), Toast.LENGTH_LONG).show();
            return false;
        }
        if(altura.getText().toString().isEmpty()){
            Toast.makeText(this, getString(R.string.error_guardar), Toast.LENGTH_LONG).show();
            return false;
        }
        if(total.getText().toString().isEmpty()){
            Toast.makeText(this, getString(R.string.error_guardar), Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }


}
