package com.example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by karol on 20.07.16.
 */
@Entity
public class RoleDB {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String role;

    @OneToMany
    @JoinColumn(name = "userID")
    private long userID;

}
