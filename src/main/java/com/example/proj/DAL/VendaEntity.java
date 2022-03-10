package com.example.proj.DAL;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "VENDA", schema = "PROJUSER", catalog = "")
public class VendaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NUMVENDA", nullable = false, precision = 0)
    private int numvenda;
    @Basic
    @Column(name = "DATA", nullable = false)
    private Date data;
    @Basic
    @Column(name = "VALORTOTAL", nullable = false, precision = 0)
    private int valortotal;
    @Basic
    @Column(name = "CODCLIENTE", nullable = false, precision = 0)
    private int codcliente;

    public int getNumvenda() {
        return numvenda;
    }

    public void setNumvenda(int numvenda) {
        this.numvenda = numvenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendaEntity that = (VendaEntity) o;
        return numvenda == that.numvenda && valortotal == that.valortotal && codcliente == that.codcliente && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numvenda, data, valortotal, codcliente);
    }
}
