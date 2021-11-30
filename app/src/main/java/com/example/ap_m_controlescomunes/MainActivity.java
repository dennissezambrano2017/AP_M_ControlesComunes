package com.example.ap_m_controlescomunes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view){
        Intent intent = new Intent(MainActivity.this, MainDatosEnviado.class);

        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        EditText txtFecha =(EditText)findViewById(R.id.txtFecha);

        Bundle datos = new Bundle();

        datos.putString("Datos", txtNombre.getText().toString() +"\n"
                +"Teléfono:"+ txtTelefono.getText().toString() +"\n"
                + "Fecha Nac:" + txtFecha.getText().toString());
        intent.putExtras(datos);
        startActivity(intent);
    }
}