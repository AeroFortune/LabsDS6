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
        List<Chats> chats = new ArrayList<>();
        chats.add(new Chats("Random #1", "bruh........", "2:30", "1"));
        chats.add(new Chats("Random #2", "hey dude ya hiciste el lab 4?", "2:30", "32"));
        return chats;
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
                Intent i = new Intent(getApplicationContext(), InstagramActivity.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}