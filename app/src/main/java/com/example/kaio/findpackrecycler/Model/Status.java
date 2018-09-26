package com.example.kaio.findpackrecycler.Model;

public class Status {

    private String cidade;
    private String data;
    private String hora;
    private String status;
    private String uf;

    public Status(String cidade, String data, String hora, String status, String uf) {
        this.cidade = cidade;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.uf = uf;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
