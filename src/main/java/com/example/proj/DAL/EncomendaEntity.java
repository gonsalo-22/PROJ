package com.example.proj.DAL;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ENCOMENDA", schema = "PROJUSER", catalog = "")
public class EncomendaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NUMENCOMENDA", nullable = false, precision = 0)
    private int numencomenda;
    @Basic
    @Column(name = "DATA", nullable = false)
    private Date data;
    @Basic
    @Column(name = "VALORTOTAL", nullable = false, precision = 0)
    private short valortotal;
    @Basic
    @Column(name = "CODFORNECEDOR", nullable = false, precision = 0)
    private int codfornecedor;

    public int getNumencomenda() {
        return numencomenda;
    }

    public void setNumencomenda(int numencomenda) {
        this.numencomenda = numencomenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public short getValortotal() {
        return valortotal;
    }

    public void setValortotal(short valortotal) {
        this.valortotal = valortotal;
    }

    public int getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(int codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EncomendaEntity that = (EncomendaEntity) o;
        return numencomenda == that.numencomenda && valortotal == that.valortotal && codfornecedor == that.codfornecedor && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numencomenda, data, valortotal, codfornecedor);
    }
}
