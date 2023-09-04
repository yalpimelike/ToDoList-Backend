package com.melikesivrikaya.toDoList.request;

import lombok.Data;

@Data
public class DeleteFriendByUserIdAndFriendIdRequest {
    private Long userId,friendId;
}
