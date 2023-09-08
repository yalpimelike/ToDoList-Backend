package com.melikesivrikaya.toDoList.response;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.model.FriendState;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.model.UserTitle;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class FriendStateResponce {
    private Long id;
    private Long friendId;
    private Long userId;
    private String name;
    private FriendState friendState;
    private String profilFotoUrl;
    private String address;
    private UserTitle title;

    public FriendStateResponce(Friend friend, User user){
        this.id=friend.getId();
        this.friendId = friend.getFriendId();
        this.userId = friend.getUserId();
        this.name = friend.getName();
        this.profilFotoUrl = user.getProfilFotoUrl();
        this.friendState = friend.getFriendState();
        this.title=user.getTitle();
        this.address=user.getAddress();
    }
    public FriendStateResponce(Long friendId, User user){
        this.friendId = friendId;
        this.userId = user.getId();
        this.name = user.getName();
        this.profilFotoUrl = user.getProfilFotoUrl();
        this.friendState = null;
        this.title=user.getTitle();
        this.address=user.getAddress();
    }

}
