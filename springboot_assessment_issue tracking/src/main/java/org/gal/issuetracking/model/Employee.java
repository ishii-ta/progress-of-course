package org.gal.issuetracking.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "employee")
    private List<Issue> issues;

    public Employee() {}

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}