package com.example.usuario.notengotiempo.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usuario.notengotiempo.pojo.Tarea;
import com.example.usuario.notengotiempo.repository.TareasRepository;
import com.example.usuario.notengotiempo.R;

public class CustomAdapter extends ArrayAdapter<Tarea> {

    public CustomAdapter(@NonNull Context context) {
        super(context, R.layout.item_tarea, TareasRepository.getInstance().getTareas());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TareaHolder TareaHolder;
        View view = convertView;

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(R.layout.item_tarea, null);
            TareaHolder = new TareaHolder();

            TareaHolder.txvNombre = view.findViewById(R.id.txvNombre);
            TareaHolder.txvDescripcion = view.findViewById(R.id.txvDescripcion);
            TareaHolder.txvImportancia = view.findViewById(R.id.txvImportancia);
            TareaHolder.txvFecha = view.findViewById(R.id.txvFecha);
            TareaHolder.txvEnlace = view.findViewById(R.id.txvEnlace);
            TareaHolder.imvImagen = view.findViewById(R.id.imvImagen);
            view.setTag(TareaHolder);
        }
        else {
            TareaHolder = (TareaHolder) view.getTag();
        }

        TareaHolder.txvNombre.setText(getItem(position).getNombre());
        TareaHolder.txvDescripcion.setText(getItem(position).getDescripcion());
        TareaHolder.txvImportancia.setText(getItem(position).getImportancia());
        TareaHolder.txvFecha.setText(getItem(position).getFecha().toString());
        TareaHolder.txvEnlace.setText(getItem(position).getEnlace().toString());
        TareaHolder.imvImagen.setImageResource(getItem(position).getImagen());

        return view;
    }

    public CustomAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    class TareaHolder {
        TextView txvNombre;
        TextView txvDescripcion;
        TextView txvImportancia;
        TextView txvFecha;
        TextView txvEnlace;
        ImageView imvImagen;
    }
}