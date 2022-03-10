package com.example.proj.DAL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LINHAVENDA", schema = "PROJUSER", catalog = "")
@IdClass(LinhavendaEntityPK.class)
public class LinhavendaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDPECA", nullable = false, precision = 0)
    private int idpeca;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NUMVENDA", nullable = false, precision = 0)
    private int numvenda;
    @Basic
    @Column(name = "PRECOUNIT", nullable = false, precision = 0)
    private int precounit;
    @Basic
    @Column(name = "QTD", nullable = false, precision = 0)
    private int qtd;

    public int getIdpeca() {
        return idpeca;
    }

    public void setIdpeca(int idpeca) {
        this.idpeca = idpeca;
    }

    public int getNumvenda() {
        return numvenda;
    }

    public void setNumvenda(int numvenda) {
        this.numvenda = numvenda;
    }

    public int getPrecounit() {
        return precounit;
    }

    public void setPrecounit(int precounit) {
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
        LinhavendaEntity that = (LinhavendaEntity) o;
        return idpeca == that.idpeca && numvenda == that.numvenda && precounit == that.precounit && qtd == that.qtd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpeca, numvenda, precounit, qtd);
    }
}
