package com.melikesivrikaya.toDoList.request;

import com.melikesivrikaya.toDoList.model.FriendState;
import lombok.Data;

@Data
public class UpdateFriendRequest {

    private Long id;
    private FriendState friendState;
}
