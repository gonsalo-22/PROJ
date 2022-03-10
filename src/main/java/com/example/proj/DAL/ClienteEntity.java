package com.example.proj.DAL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CLIENTE", schema = "PROJUSER", catalog = "")
public class ClienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODCLIENTE", nullable = false, precision = 0)
    private int codcliente;
    @Basic
    @Column(name = "NOME", nullable = false, length = 30)
    private String nome;
    @Basic
    @Column(name = "NIF", nullable = false, precision = 0)
    private long nif;
    @Basic
    @Column(name = "CIDADE", nullable = false, length = 40)
    private String cidade;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    private String email;

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNif() {
        return nif;
    }

    public void setNif(long nif) {
        this.nif = nif;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return codcliente == that.codcliente && nif == that.nif && Objects.equals(nome, that.nome) && Objects.equals(cidade, that.cidade) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codcliente, nome, nif, cidade, email);
    }
}
