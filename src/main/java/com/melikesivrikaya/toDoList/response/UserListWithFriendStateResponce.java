package com.melikesivrikaya.toDoList.response;

import com.melikesivrikaya.toDoList.model.FriendState;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.model.UserTitle;
import lombok.Data;

@Data
public class UserListWithFriendStateResponce {
    private Long id;
    private String name;
    private String address;
    private FriendState friendState;
    private UserTitle title;
    private String profilFotoUrl;
    public UserListWithFriendStateResponce(User user , FriendState friendState){
        this.id = user.getId();
        this.name = user.getName();
        this.address = user.getAddress();
        this.friendState = friendState;
        this.title = user.getTitle();
        this.profilFotoUrl= user.getProfilFotoUrl();
    }
    public UserListWithFriendStateResponce(User user ){
        this.id = user.getId();
        this.name = user.getName();
        this.title = user.getTitle();
        this.address = user.getAddress();
        this.friendState = null;
        this.profilFotoUrl= user.getProfilFotoUrl();
    }
}
