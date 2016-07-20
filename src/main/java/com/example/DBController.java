package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.example.DB.UserRepositoryDB;

/**
 * Created by karol on 20.07.16.
 */
@Controller

public class DBController {

    @Autowired
    private UserDAO userdao;

    private String password = "admin";
    private String login = "Admin";

    @RequestMapping("/add")
    @ResponseBody
    public String addUserToDB(String login){
        String userId = "";
        try  {
            UserDB user = new UserDB(this.login, this.password);
            userdao.save(user);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex){
            return "Error creating user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }


    @RequestMapping("/get")
    @ResponseBody
    public String getByEmail(String login) {
        String userId = "";
        try {
            UserDB user = userdao.findByLogin(login);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }
}


