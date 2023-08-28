package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.ListTitleWithListResponce;
import com.melikesivrikaya.toDoList.responce.ListTitleResponce;

import java.util.List;
import java.util.Optional;

public interface ListTitleController {
    List<ListTitleWithListResponce> getListTitles();
    ListTitleResponce getListTitle(Long id);
    void deleteListTitle(Long id);
    ListTitleResponce createListTitle(ListTitle listTitle);
    ListTitleResponce updateListTitle(ListTitle listTitle);
    List<ListTitleWithListResponce> getListTitlesByUserId(Long userId);

}
