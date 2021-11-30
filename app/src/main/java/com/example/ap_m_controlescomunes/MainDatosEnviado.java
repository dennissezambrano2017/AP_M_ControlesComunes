package com.example.ap_m_controlescomunes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainDatosEnviado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_datos_enviado);

        TextView  txtSaludo = (TextView)findViewById(R.id.txtContenido);

        Bundle bundle = this.getIntent().getExtras();

        txtSaludo.setText("Hola!, Bienvenido " + bundle.getString("Datos"));

    }
}