package com.example.evc02_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_nombre,txt_apellido,txt_rptaNombre,txt_rptaApellido;
    private TextView tv_bienvenida,tv_respuesta;
    float numero1=0.0f;
    float numero2=0.0f;
    String operacion="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_nombre=findViewById(R.id.txtNombre);
        txt_apellido=findViewById(R.id.txtApellido);
        txt_rptaNombre=findViewById(R.id.txtRptaNombre);
        txt_rptaApellido=findViewById(R.id.txtRptaApellido);
        tv_bienvenida=findViewById(R.id.tvBienvenida);


        tv_respuesta=findViewById(R.id.tvRespuesta);

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


    public void EscribeCero(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("0");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"0");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeUno(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("1");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"1");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeDos(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("2");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"2");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeTres(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("3");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"3");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeCuatro(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("4");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"4");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeCinco(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("5");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"5");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeSeis(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("6");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"6");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeSiete(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("7");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"7");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeOcho(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("8");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"8");
            numero1=0.0f;
            numero2=0.0f;
        }
    }
    public void EscribeNueve(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("9");
            numero1=0.0f;
            numero2=0.0f;
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"9");
            numero1=0.0f;
            numero2=0.0f;
        }
    }

}