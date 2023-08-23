package com.melikesivrikaya.toDoList.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Table(name = "friend")
public class Friend {
    @Id
    private Long id;
    private String name;
    private FriendState friendState;
}
