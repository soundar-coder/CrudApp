package com.leanring.crud.Repository;

import com.leanring.crud.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo  extends JpaRepository<UserEntity,Long> {
    @Query("SELECT u from  UserEntity  u WHERE  u.gmail=:gmail")
    UserEntity  findByMail(@Param("gmail") String gmail);
}
