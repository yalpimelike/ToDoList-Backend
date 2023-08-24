package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.List;

import java.util.Optional;

public interface ListController {
    java.util.List<List> getLists();
    Optional<List> getList(Long id);
    void deleteList(Long id);
    com.melikesivrikaya.toDoList.model.List createList(com.melikesivrikaya.toDoList.model.List list);
    com.melikesivrikaya.toDoList.model.List updateList(com.melikesivrikaya.toDoList.model.List list);
}
