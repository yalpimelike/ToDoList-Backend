package com.melikesivrikaya.toDoList.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "usergallery")
@AllArgsConstructor
@RequiredArgsConstructor
public class UserFoto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String fotoUrl;
}
