package com.example.proj.DAL;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class LinhavendaEntityPK implements Serializable {
    @Column(name = "IDPECA", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpeca;
    @Column(name = "NUMVENDA", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numvenda;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhavendaEntityPK that = (LinhavendaEntityPK) o;
        return idpeca == that.idpeca && numvenda == that.numvenda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpeca, numvenda);
    }
}
