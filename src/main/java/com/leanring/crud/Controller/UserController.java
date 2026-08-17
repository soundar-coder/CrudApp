package com.leanring.crud.Controller;


import com.leanring.crud.Entity.UserEntity;
import com.leanring.crud.Services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
     UserService us;

    @GetMapping("/getUser{id}")
    public UserEntity  getUser(@PathVariable Long id){
       return  us.getUser(id);

    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserEntity ue){

          us.adduser(ue);
          return "user RegisterSuccesfully ";

    }

    @DeleteMapping("/delete/{id}")
    public String  deleteUser(@PathVariable Long id){
       return   us.deleteUser(id);

    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id ,@RequestBody UserEntity ue){

        us.update(id,ue);
        return "deelte succeesfully";
    }
    @GetMapping("/getMail/{mail}")
    public UserEntity getMail(@PathVariable String mail){

        return us.getMail(mail);

    }



}
