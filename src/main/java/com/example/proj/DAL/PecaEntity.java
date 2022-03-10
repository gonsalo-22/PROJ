package com.example.proj.DAL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PECA", schema = "PROJUSER", catalog = "")
public class PecaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDPECA", nullable = false, precision = 0)
    private int idpeca;
    @Basic
    @Column(name = "NOME", nullable = false, length = 20)
    private String nome;
    @Basic
    @Column(name = "QTD", nullable = false, precision = 0)
    private int qtd;
    @Basic
    @Column(name = "PRECOUNID", nullable = false, length = 20)
    private String precounid;

    public int getIdpeca() {
        return idpeca;
    }

    public void setIdpeca(int idpeca) {
        this.idpeca = idpeca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getPrecounid() {
        return precounid;
    }

    public void setPrecounid(String precounid) {
        this.precounid = precounid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PecaEntity that = (PecaEntity) o;
        return idpeca == that.idpeca && qtd == that.qtd && Objects.equals(nome, that.nome) && Objects.equals(precounid, that.precounid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpeca, nome, qtd, precounid);
    }
}
