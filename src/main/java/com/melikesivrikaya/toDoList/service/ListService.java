package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.ListTitle;

import java.util.List;
import java.util.Optional;

public interface ListService {
    List<com.melikesivrikaya.toDoList.model.List> getLists();
    Optional<com.melikesivrikaya.toDoList.model.List> getList(Long id);
    void deleteList(Long id);
    com.melikesivrikaya.toDoList.model.List createList(com.melikesivrikaya.toDoList.model.List list);
    com.melikesivrikaya.toDoList.model.List updateList(com.melikesivrikaya.toDoList.model.List list);
    java.util.List<com.melikesivrikaya.toDoList.model.List> getListsByUserId(Long userId);
}
