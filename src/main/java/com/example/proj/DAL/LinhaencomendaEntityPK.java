package com.example.proj.DAL;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class LinhaencomendaEntityPK implements Serializable {
    @Column(name = "NUMENCOMENDA", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numencomenda;
    @Column(name = "IDTECIDO", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtecido;

    public int getNumencomenda() {
        return numencomenda;
    }

    public void setNumencomenda(int numencomenda) {
        this.numencomenda = numencomenda;
    }

    public int getIdtecido() {
        return idtecido;
    }

    public void setIdtecido(int idtecido) {
        this.idtecido = idtecido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhaencomendaEntityPK that = (LinhaencomendaEntityPK) o;
        return numencomenda == that.numencomenda && idtecido == that.idtecido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numencomenda, idtecido);
    }
}
