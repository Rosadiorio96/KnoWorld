package com.rosaclaudia.knoworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rosaclaudia.knoworld.datamodel.Citta;

import java.util.List;

public class CittaAdapter extends BaseAdapter {

    private Context context;
    private List<Citta> elencoCitta;


    public CittaAdapter(Context context,List<Citta> elencoCitta) {
        this.context = context;
        this.elencoCitta = elencoCitta;
    }

    @Override
    public int getCount() {
        return elencoCitta.size();
    }

    @Override
    public Object getItem(int position) {
        return elencoCitta.get(position);

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.riga_citta, null);}

        TextView vnome = convertView.findViewById(R.id.textNomeCitta);

        Citta c = elencoCitta.get(position);
        vnome.setText(c.getNome());

        return convertView;
    }
}
