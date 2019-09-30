package com.example.aplicacionmaestra;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etPaginasWeb;
    private EditText etApps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etApps = findViewById(R.id.et_Apps);
        etPaginasWeb = findViewById(R.id.et_Paginas_Web);
    }

    public void cambiarApp(View v) {
        String tipoOperacion =   "app";
        String nombrePaquete = etApps.getText().toString();
        ConexionOnline conexionOnline = new ConexionOnline(this);
        conexionOnline.execute(tipoOperacion, nombrePaquete);
    }

    public void cambiarPaginaWeb(View v) {
        String tipoOperacion = "web";
        String direccionWeb = etPaginasWeb.getText().toString();
        ConexionOnline conexionOnline = new ConexionOnline(this);
        conexionOnline.execute(tipoOperacion, direccionWeb);
    }
}
