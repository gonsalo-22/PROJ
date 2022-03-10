package com.example.proj.DAL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FORNECEDOR", schema = "PROJUSER", catalog = "")
public class FornecedorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODFORNECEDOR", nullable = false, precision = 0)
    private int codfornecedor;
    @Basic
    @Column(name = "NOME", nullable = false, length = 20)
    private String nome;
    @Basic
    @Column(name = "RUA", nullable = false, length = 20)
    private String rua;
    @Basic
    @Column(name = "NPORTA", nullable = false, precision = 0)
    private short nporta;
    @Basic
    @Column(name = "NIF", nullable = false, precision = 0)
    private int nif;
    @Basic
    @Column(name = "CODPOSTAL", nullable = false, precision = 0)
    private int codpostal;

    public int getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(int codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public short getNporta() {
        return nporta;
    }

    public void setNporta(short nporta) {
        this.nporta = nporta;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public int getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(int codpostal) {
        this.codpostal = codpostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FornecedorEntity that = (FornecedorEntity) o;
        return codfornecedor == that.codfornecedor && nporta == that.nporta && nif == that.nif && codpostal == that.codpostal && Objects.equals(nome, that.nome) && Objects.equals(rua, that.rua);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codfornecedor, nome, rua, nporta, nif, codpostal);
    }
}
