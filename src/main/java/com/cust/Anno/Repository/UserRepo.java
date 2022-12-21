package com.cust.Anno.Repository;

import com.cust.Anno.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.Long;
public interface UserRepo extends JpaRepository<User, Long> {

}