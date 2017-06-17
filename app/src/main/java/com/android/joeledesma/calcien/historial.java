package com.android.joeledesma.calcien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

import static com.android.joeledesma.calcien.R.id.bntborrarhist;
import static com.android.joeledesma.calcien.R.id.listaview;
import static com.android.joeledesma.calcien.R.layout.activity_historial;

public class historial extends AppCompatActivity implements View.OnClickListener {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_historial);

        Button expone = (Button) findViewById(R.id.bntborrarhist);
        expone.setOnClickListener(this);

        lista = (ListView) findViewById(listaview);

        ArrayList<String> lista_result = (ArrayList<String>) getIntent().getSerializableExtra("prueba");
//        ArrayList<String> resultado = new ArrayList<>();
//
//        for (int i = 0; i < lista_result.size(); i++) {
//            resultado.add(lista_result.get(i));
//        }

        lista.setAdapter(new ArrayAdapter<>(this, R.layout.historial, lista_result));

    }

    @Override
    public void onClick(View v) {
        int borr = v.getId();
        switch (borr){

            case R.id.bntborrarhist:           //Limpiamos la pantalla
                lista.setAdapter(null);
                break;
        }
    }
}