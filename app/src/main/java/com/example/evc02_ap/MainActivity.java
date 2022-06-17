package com.example.evc02_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_nombre,txt_apellido,txt_rptaNombre,txt_rptaApellido;
    private TextView tv_bienvenida;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_nombre=findViewById(R.id.txtNombre);
        txt_apellido=findViewById(R.id.txtApellido);
        txt_rptaNombre=findViewById(R.id.txtRptaNombre);
        txt_rptaApellido=findViewById(R.id.txtRptaApellido);
        tv_bienvenida=findViewById(R.id.tvBienvenida);

    }
    public void MuestraNombre(View view){

        txt_rptaNombre.setText(txt_nombre.getText().toString()+"");
        txt_rptaApellido.setText(txt_apellido.getText().toString()+"");
    }
    public void Cancelar(View view){

        txt_rptaNombre.setText("");
        txt_rptaApellido.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
    }

}