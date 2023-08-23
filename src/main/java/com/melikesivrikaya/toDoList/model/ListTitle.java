package com.melikesivrikaya.toDoList.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Table(name = "listtitle")
public class ListTitle {
    @Id
    private Long id;
    private Long userId;
    private String listName;
    private List list;
}
