package com.darkhan.myspringsecurity.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "year_of_birth")
    private int year_of_birth;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public Person(String username, int year_of_birth, String password, String role) {
        this.username = username;
        this.year_of_birth = year_of_birth;
        this.password = password;
        this.role = role;
    }
}
