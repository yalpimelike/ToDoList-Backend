package com.melikesivrikaya.toDoList.request;

import lombok.Data;

@Data
public class CreateFriendRequest {
    private Long friendId;
    private Long userId;
}
