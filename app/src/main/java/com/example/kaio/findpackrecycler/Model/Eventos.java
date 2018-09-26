package com.example.kaio.findpackrecycler.Model;

public class Eventos {

    private String data;
    private String evento;

    public Eventos(String data, String evento) {
        this.data = data;
        this.evento = evento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
