package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.DB.UserRepositoryDB;

/**
 * Created by karol on 20.07.16.
 */
@Controller
@RequestMapping("/")
public class DBController {

    @Autowired
    private UserDAO userdao;

    @Autowired
    private RoleDAO roleDAO;

    private String password = "admin";
    private String login = "Admin";
    private String role1 = "ADMIN";
    private String role2 = "USER";

    @RequestMapping("addUser")
    @ResponseBody
    public String addUserToDB(String login){
        String userId = "";
        String roleid = "";
        try  {

            UserDB user = new UserDB(this.login, this.password, roleDAO.findByRole(role1));
            userdao.save(user);
            userId = String.valueOf(user.getUserID());
            roleid = String.valueOf(user.getRoleID());
        }
        catch (Exception ex){
            return "Error creating user: " + ex.toString();
        }
        return "User succesfully created with userid = " + userId + " and roleid" + roleid;
    }


    @RequestMapping("getuser")
    @ResponseBody
    public String getByEmail(String login) {
        String userId = "";
        try {
            UserDB user = userdao.findByLogin(login);
            userId = String.valueOf(user.getUserID());
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }


    @RequestMapping("addRole")
    public String addRoles(){
//        String rolesID = "";
//        try {
//            RoleDB roleDB1 = new RoleDB(role1);
//            RoleDB roleDB2 = new RoleDB(role2);
//            roleDAO.save(roleDB1);
//            roleDAO.save(roleDB2);
//            rolesID = String.valueOf(roleDB1.getId())+ "   " + String.valueOf(roleDB2.getId());
//        }
//        catch (Exception ex) {
//            return "Error while adding roles" + ex.toString();
//        }
//        return "Roles has been added "  + rolesID;
        return "AAAAA";
    }



}


