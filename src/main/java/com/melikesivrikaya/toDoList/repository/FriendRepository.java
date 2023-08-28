package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend,Long> {
}
