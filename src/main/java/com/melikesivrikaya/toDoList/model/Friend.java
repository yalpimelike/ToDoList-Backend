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
    private Long friendId;   //Arkadaşlık bağı oluşturan kullanıcı id si
    private Long userId;     //Arkadaşlık bağı oluşturulan kullanıcı id si
    private String name;
    private FriendState friendState;

    public Friend(Long friendId, Long userId, String name, FriendState friendState) {
        this.friendId = friendId;
        this.userId = userId;
        this.name = name;
        this.friendState = friendState;
    }
}
