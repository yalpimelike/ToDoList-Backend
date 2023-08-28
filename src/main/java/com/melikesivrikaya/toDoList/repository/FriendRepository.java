package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend,Long> {
    List<Friend> findAllByUserId(Long id);
}
