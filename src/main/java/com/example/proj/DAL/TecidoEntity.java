package com.example.proj.DAL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TECIDO", schema = "PROJUSER", catalog = "")
public class TecidoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDTECIDO", nullable = false, precision = 0)
    private int idtecido;
    @Basic
    @Column(name = "DESCRICAO", nullable = false, length = 20)
    private String descricao;
    @Basic
    @Column(name = "CODFORNECEDOR", nullable = false, precision = 0)
    private int codfornecedor;

    public int getIdtecido() {
        return idtecido;
    }

    public void setIdtecido(int idtecido) {
        this.idtecido = idtecido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        TecidoEntity that = (TecidoEntity) o;
        return idtecido == that.idtecido && codfornecedor == that.codfornecedor && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtecido, descricao, codfornecedor);
    }
}
