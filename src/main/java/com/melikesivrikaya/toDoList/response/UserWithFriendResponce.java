package com.melikesivrikaya.toDoList.response;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.model.User;
import lombok.Data;

import java.util.List;

@Data
public class UserWithFriendResponce {
    private Long id;
    private String name;
    private String address;
    private List<Friend> friendList;
    public UserWithFriendResponce(User user , List<Friend> friends){
        this.id = user.getId();
        this.name = user.getName();
        this.address = user.getAddress();
        this.friendList = friends;
    }
}
