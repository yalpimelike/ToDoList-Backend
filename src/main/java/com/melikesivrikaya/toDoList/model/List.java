package com.melikesivrikaya.toDoList.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Table(name = "list")
public class List {
    @Id
    private Long id;
    private Long listNameId;
    private Long userId;
    private String task;
    private boolean state;

}
