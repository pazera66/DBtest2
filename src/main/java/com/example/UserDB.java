package com.example;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;

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
    private long userID;

    @NotNull
    private String login;

    @NotNull
    private String passwordHash;


    @Column(name = "role_id")
    private long roleID;



    //List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<SimpleGrantedAuthority>();

    public UserDB (){}


    public UserDB(String login, String passwordHash, long roleid){
        this.login=login;
        this.passwordHash = passwordHash;
        this.roleID=roleid;

    }



//    UserDetails createUserDetails(){
//        grantedAuthorities.add(new SimpleGrantedAuthority(role.toString()));
//        return new org.springframework.security.core.userdetails.User(login, passwordHash, true,true,true,true, grantedAuthorities);
//    }


    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getLogin() {
        return login;
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

    public long getRoleID() {
        return roleID;
    }

    public void setRoleID(long roleID) {
        this.roleID = roleID;
    }
}
