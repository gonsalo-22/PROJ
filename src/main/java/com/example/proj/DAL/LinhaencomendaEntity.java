package com.example.proj.DAL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LINHAENCOMENDA", schema = "PROJUSER", catalog = "")
@IdClass(LinhaencomendaEntityPK.class)
public class LinhaencomendaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NUMENCOMENDA", nullable = false, precision = 0)
    private int numencomenda;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDTECIDO", nullable = false, precision = 0)
    private int idtecido;
    @Basic
    @Column(name = "PRECOUNIT", nullable = false, precision = 0)
    private short precounit;
    @Basic
    @Column(name = "QTD", nullable = false, precision = 0)
    private int qtd;

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

    public short getPrecounit() {
        return precounit;
    }

    public void setPrecounit(short precounit) {
        this.precounit = precounit;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhaencomendaEntity that = (LinhaencomendaEntity) o;
        return numencomenda == that.numencomenda && idtecido == that.idtecido && precounit == that.precounit && qtd == that.qtd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numencomenda, idtecido, precounit, qtd);
    }
}
