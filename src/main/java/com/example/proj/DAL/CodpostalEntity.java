package com.example.proj.DAL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CODPOSTAL", schema = "PROJUSER", catalog = "")
public class CodpostalEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODPOSTAL", nullable = false, precision = 0)
    private int codpostal;
    @Basic
    @Column(name = "LOCALIDADE", nullable = false, length = 40)
    private String localidade;

    public int getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(int codpostal) {
        this.codpostal = codpostal;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodpostalEntity that = (CodpostalEntity) o;
        return codpostal == that.codpostal && Objects.equals(localidade, that.localidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codpostal, localidade);
    }
}
