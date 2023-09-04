package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

}
