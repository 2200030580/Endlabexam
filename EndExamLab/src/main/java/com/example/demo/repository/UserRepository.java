package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>
{
	  @Query("select count(u) from User u where u.username=:username and u.password=:password")
	  public String validate(@Param("username")String username,@Param("password")String password);
}
