package com.example.instafake;
import android.os.Bundle;

public class Chats {

    // private int Foto;
    private String nombre;
    private String chat;
    private String hora;
    private String chatCount;

    public Chats(String nombre, String chat, String hora, String chatCount) {
        this.nombre = nombre;
        this.chat = chat;
        this.hora = hora;
        this.chatCount = chatCount;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getChatCount() {
        return chatCount;
    }

    public void setChatCount(String chatCount) {
        this.chatCount = chatCount;
    }


}
