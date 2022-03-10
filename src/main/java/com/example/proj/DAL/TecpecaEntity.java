package com.example.proj.DAL;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "TECPECA", schema = "PROJUSER", catalog = "")
public class TecpecaEntity {
    @Basic
    @Column(name = "IDTECIDO", nullable = false, precision = 0)
    private int idtecido;
    @Basic
    @Column(name = "IDPECA", nullable = false, precision = 0)
    private int idpeca;

    public int getIdtecido() {
        return idtecido;
    }

    public void setIdtecido(int idtecido) {
        this.idtecido = idtecido;
    }

    public int getIdpeca() {
        return idpeca;
    }

    public void setIdpeca(int idpeca) {
        this.idpeca = idpeca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TecpecaEntity that = (TecpecaEntity) o;
        return idtecido == that.idtecido && idpeca == that.idpeca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtecido, idpeca);
    }
}
