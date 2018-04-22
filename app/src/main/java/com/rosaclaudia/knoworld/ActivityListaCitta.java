package com.rosaclaudia.knoworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rosaclaudia.knoworld.datamodel.DataSource;

public class ActivityListaCitta extends AppCompatActivity {

    private ListView vListaCitta;
    private CittaAdapter adapter;
    private DataSource dataSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_citta);
        vListaCitta = findViewById(R.id.listaCitta);
        dataSource = DataSource.getInstance();
        adapter = new CittaAdapter(this,dataSource.getElencoCitta("R"));
        vListaCitta.setAdapter(adapter);
    }
}
