package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long> {

}
