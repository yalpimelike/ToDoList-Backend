package com.melikesivrikaya.toDoList.request;

import lombok.Data;

@Data
public class UpdateListRequest {
    private Long id;
    private boolean state;
}
