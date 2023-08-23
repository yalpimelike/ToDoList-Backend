package com.melikesivrikaya.toDoList.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String name,password,address;
    private ListTitle listTitle;
    private Friend friend;

}
