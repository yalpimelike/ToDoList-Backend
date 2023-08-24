package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.model.User;

import java.util.List;
import java.util.Optional;

public interface ListTitleService {
    List<ListTitle> getListTitles();
    Optional<ListTitle> getListTitle(Long id);
    void deleteListTitle(Long id);
    ListTitle createListTitle(ListTitle listTitle);
    ListTitle updateListTitle(ListTitle listTitle);
}
