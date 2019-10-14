package com.teambaa.notiapp.vistaCards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;


import com.teambaa.notiapp.R;
import com.teambaa.notiapp.ui.modificar_nota.ModificarNotaFragment;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>
{

    public int posicion;

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView prioridad, titulo, nota;
        private ImageView icono, icono_edit, icono_trash;


        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            prioridad = (TextView) itemView.findViewById(R.id.prioridad);
            titulo = (TextView) itemView.findViewById(R.id.titulo);
            nota = (TextView) itemView.findViewById(R.id.nota);
            icono = itemView.findViewById(R.id.icono);


        }

    }

    public List<Nota> notas;

    public RecyclerViewAdaptador(List<Nota> notas)
    {
        this.notas = notas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.nota_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(vista);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position)
    {
        posicion = position;
        holder.titulo.setText(notas.get(position).getTitulo());
        holder.nota.setText(notas.get(position).getNota());
        switch (Integer.parseInt(notas.get(position).getPrioridad()))
        {
            case 1:
                holder.prioridad.setText("URGENTE");
                holder.icono.setImageResource(R.drawable.start);
                break;
            case 2:
                holder.prioridad.setText("TAREA");
                holder.icono.setImageResource(R.drawable.task);
                break;
            case 3:
                holder.prioridad.setText("RECORDATORIO");
                holder.icono.setImageResource(R.drawable.recordatorio);
                break;
        }
    }

    @Override
    public int getItemCount()
    {
        return notas.size();
    }


}
