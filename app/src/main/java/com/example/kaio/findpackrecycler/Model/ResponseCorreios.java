package com.example.kaio.findpackrecycler.Model;

import java.util.List;

public class ResponseCorreios {

    private List<Eventos>listaEventos;
    private Status status;

    public ResponseCorreios(List<Eventos> listaEventos, Status status) {
        this.listaEventos = listaEventos;
        this.status = status;
    }


    public List<Eventos> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Eventos> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
