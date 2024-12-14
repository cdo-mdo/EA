package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String address;
    private String phone;

    @OneToMany(mappedBy = "branch")
    private Collection<Person> employees;

}
