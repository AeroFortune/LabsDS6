package com.example.instafake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class InstagramLVAdapter extends ArrayAdapter<Chats> {

    List<Chats> opciones;

    public InstagramLVAdapter(@NonNull Context context, List<Chats> datos){
        super(context, R.layout.listview_template_chats, datos);
        opciones = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listview_template_chats, null);

        TextView nombre = item.findViewById(R.id.txtNombre);
        nombre.setText(opciones.get(position).getNombre());

        TextView chat = item.findViewById(R.id.txtChat);
        chat.setText(opciones.get(position).getChat());

        TextView hora = item.findViewById(R.id.txtHora);
        hora.setText(opciones.get(position).getHora());

        TextView chatCount = item.findViewById(R.id.txtChatCount);
        chatCount.setText(opciones.get(position).getChatCount());

        // ImageView foto = (ImageView)item.findViewById(R.id.imvFoto);
        // foto.setImageResource(get(position).getFoto());

        return item;
    }

}
