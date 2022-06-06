package com.github.youssf.cities.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "pais")
@RequiredArgsConstructor
public class Country {

    @Id
    private Long id;

    @Column(name = "nome", length =  60, nullable = false)
    private String name;

    @Column(name = "nome_pt", length =  60, nullable = false)
    private String portugueseName;

    @Column(name = "sigla", length =  2, nullable = false)
    private String code;

    private Integer bacen;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Country country = (Country) o;
        return id != null && Objects.equals(id, country.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
