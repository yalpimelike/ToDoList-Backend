package com.melikesivrikaya.toDoList.response;

import com.melikesivrikaya.toDoList.model.FriendState;
import com.melikesivrikaya.toDoList.model.User;
import lombok.Data;

@Data
public class UserListWithFriendStateResponce {
    private Long id;
    private String name;
    private String address;
    private FriendState friendState;
    public UserListWithFriendStateResponce(User user , FriendState friendState){
        this.id = user.getId();
        this.name = user.getName();
        this.address = user.getAddress();
        this.friendState = friendState;
    }
    public UserListWithFriendStateResponce(User user ){
        this.id = user.getId();
        this.name = user.getName();
        this.address = user.getAddress();
    }
}