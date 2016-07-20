package com.example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

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

//    @OneToMany
//    @JoinColumn(name = "role_id")
//    private Set<UserDB> usersSet = new HashSet<>();

    RoleDB(String role){
        this.role = role;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

//    public Set<UserDB> getUsersSet() {
//        return usersSet;
//    }
//
//    public void setUsersSet(Set<UserDB> usersSet) {
//        this.usersSet = usersSet;
//    }
//
}
