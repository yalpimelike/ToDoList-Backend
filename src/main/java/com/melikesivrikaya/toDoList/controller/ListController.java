package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.response.ListResponce;

public interface ListController {
    java.util.List<ListResponce> getLists();
    ListResponce getList(Long id);
    void deleteList(Long id);
    ListResponce createList(com.melikesivrikaya.toDoList.model.List list);
    ListResponce updateList(com.melikesivrikaya.toDoList.model.List list);
    java.util.List<ListResponce> getListsByUserId(Long userId);

}
