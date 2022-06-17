package com.example.evc02_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private EditText txt_nombre,txt_apellido,txt_rptaNombre,txt_rptaApellido;
    private TextView tv_bienvenida,tv_respuesta;
    float numero1=0.0f;
    float numero2=0.0f;
    String operacion="";



    private ArrayList<String> Ciudades;

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

        lista=findViewById(R.id.list);
Ciudades=new ArrayList<>();
Ciudades.add("Panamá °12");
        Ciudades.add("Suiza °23");
        Ciudades.add("Colombia °18");
ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Ciudades);
lista.setAdapter(adapter);

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
        float numero1=Float.parseFloat(tv_respuesta.getText().toString());
        if(numero1==0.0f){
            tv_respuesta.setText("0");
        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"0");
        }
    }
    public void EscribeUno(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("1");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"1");

        }
    }
    public void EscribeDos(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("2");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"2");

        }
    }
    public void EscribeTres(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("3");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"3");

        }
    }
    public void EscribeCuatro(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("4");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"4");

        }
    }
    public void EscribeCinco(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("5");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"5");

        }
    }
    public void EscribeSeis(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("6");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"6");

        }
    }
    public void EscribeSiete(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("7");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"7");

        }
    }
    public void EscribeOcho(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("8");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"8");

        }
    }
    public void EscribeNueve(View view){
        float valor=Float.parseFloat(tv_respuesta.getText().toString());
        if(valor==0.0f){
            tv_respuesta.setText("9");

        }else{
            tv_respuesta.setText(tv_respuesta.getText()+"9");

        }
    }


    public void LimpiarResultado(View view){
        tv_respuesta.setText("0");
        numero1=0.0f;
        numero2=0.0f;
        operacion="";
    }

    public void Dividir(View view){
        numero1=Float.parseFloat(tv_respuesta.getText().toString());
        operacion="/";
        tv_respuesta.setText("0");
    }
    public void Sumar(View view){
        numero1=Float.parseFloat(tv_respuesta.getText().toString());
        operacion="+";
        tv_respuesta.setText("0");
    }
    public void Restar(View view){
        numero1=Float.parseFloat(tv_respuesta.getText().toString());
        operacion="-";
        tv_respuesta.setText("0");
    }
    public void Multiplicar(View view){
        numero1=Float.parseFloat(tv_respuesta.getText().toString());
        operacion="*";
        tv_respuesta.setText("0");
    }
    public void MostrarResultado(View view){
        numero2=Float.parseFloat(tv_respuesta.getText().toString());
        if(operacion.equals("/")){
            if(numero2==0.0f){
                tv_respuesta.setText("0");
                Toast.makeText(this, "Operacion no valida", Toast.LENGTH_SHORT).show();
                numero1=0.0f;
                numero2=0.0f;
            }else{
                float result=numero1/numero2;
                tv_respuesta.setText(result+"");
                numero1=0.0f;
                numero2=0.0f;
            }
        }else if(operacion.equals("+")){
            float result=numero1+numero2;
            tv_respuesta.setText(result+"");
            numero1=0.0f;
            numero2=0.0f;
        }else if(operacion.equals("-")){
            float result=numero1-numero2;
            tv_respuesta.setText(result+"");
            numero1=0.0f;
            numero2=0.0f;
        }else if(operacion.equals("*")){
            float result=numero1*numero2;
            tv_respuesta.setText(result+"");
            numero1=0.0f;
            numero2=0.0f;
        }
    }

}

