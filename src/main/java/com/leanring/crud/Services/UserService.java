package com.leanring.crud.Services;


import com.leanring.crud.Entity.UserEntity;
import com.leanring.crud.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo ur;

    public UserEntity getUser(Long id){

        return  ur.findById(id).orElseThrow();
    }

    public UserEntity adduser(UserEntity ue){

        return ur.save(ue);
    }

    public String deleteUser(Long id){
        ur.deleteById(id);
        return "success";
    }
    //update

    public String update(Long id ,UserEntity ue){
        UserEntity olduser=ur.findById(id).orElseThrow();

        olduser.setEmpid(ue.getEmpid());
        olduser.setGmail(ue.getGmail());
        olduser.setPassword(ue.getPassword());
        olduser.setUsername(ue.getUsername());

        ur.save(olduser);


 return "update successfully";


    }

    public UserEntity getMail(String mail){
        System.out.println(("soundar"));
        return  ur.findByMail(mail);

    }
}
