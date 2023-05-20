package com.example.instafake;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstChats;
    InstagramLVAdapter adapterChats;

    List<Chats> chats = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.InicializarControles();
        adapterChats = new InstagramLVAdapter(getApplicationContext(), LlenarListView());
        lstChats.setAdapter(adapterChats);
    }

    private void InicializarControles() {
        lstChats = (ListView) findViewById(R.id.lstChats);
    }

    private List<Chats> LlenarListView(){
        chats.add(new Chats("Random #1", "bruh........", "2:30", "1"));
        chats.add(new Chats("Random #2", "hey dude ya hiciste el lab 4?", "2:30", "32"));
        return chats;
    }

    private void AgregarNuevoElementoListView(){
        chats.add(new Chats("Test", "Prueba", "6:12 PM", "1"));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.miNew:
                // Se supone que debemos agregar un NUEVO elemento o IR a una pantalla nueva y agregarlo ahi?
                // Lo que hice es ir con lo primero.
                AgregarNuevoElementoListView();
                adapterChats = new InstagramLVAdapter(getApplicationContext(), LlenarListView());
                lstChats.setAdapter(adapterChats);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}