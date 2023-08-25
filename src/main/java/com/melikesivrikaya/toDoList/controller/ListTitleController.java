package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.model.User;

import java.util.List;
import java.util.Optional;

public interface ListTitleController {
    List<ListTitle> getListTitles();
    Optional<ListTitle> getListTitle(Long id);
    void deleteListTitle(Long id);
    ListTitle createListTitle(ListTitle listTitle);
    ListTitle updateListTitle(ListTitle listTitle);
    List<ListTitle> getListTitlesByUserId(Long userId);
}
