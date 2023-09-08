package com.melikesivrikaya.toDoList.request;

import lombok.Data;

@Data
public class IsUsersFriendRequest {
    private Long userId;
    private Long friendId;
}
