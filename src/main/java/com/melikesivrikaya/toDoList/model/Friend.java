package com.melikesivrikaya.toDoList.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "friend")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long friendId; // friend listesine eklenecek kişinin id si
    private Long userId; // bu friends objesinin tepsil edeceği user id si
    private String name;
    private FriendState friendState;
}
