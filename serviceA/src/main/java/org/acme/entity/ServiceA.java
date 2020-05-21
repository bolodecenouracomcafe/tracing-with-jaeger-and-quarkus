package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "servicea")
public class ServiceA extends PanacheEntityBase {

    @Id
    @SequenceGenerator(
            name = "servicea_sequence",
            sequenceName = "servicea_sequence",
            allocationSize = 1,
            initialValue = 4)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "servicea_sequence")
    @Column(name = "id")

    public long id;
    @Column(name = "name")
    public String name;

    public ServiceA(String name) {
        super();
        this.name = name;
    }

    public ServiceA() {

    }

}
