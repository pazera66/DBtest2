package com.example;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by karol on 19.07.16.
 */
@Entity
@Table(name="users")
public class UserDB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String login;

    @NotNull
    private String passwordHash;

    private long roleID;



    //List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<SimpleGrantedAuthority>();

    public UserDB (){}

    public UserDB(long id){
        this.id=id;
    }

    public UserDB(String login, String passwordHash){
        this.login=login;
        this.passwordHash = passwordHash;

    }



//    UserDetails createUserDetails(){
//        grantedAuthorities.add(new SimpleGrantedAuthority(role.toString()));
//        return new org.springframework.security.core.userdetails.User(login, passwordHash, true,true,true,true, grantedAuthorities);
//    }


    String getLogin(){
        return login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }


}
