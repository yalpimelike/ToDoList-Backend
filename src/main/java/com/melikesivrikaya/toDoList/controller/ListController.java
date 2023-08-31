package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.request.UpdateListRequest;
import com.melikesivrikaya.toDoList.response.ListResponce;

public interface ListController {
    java.util.List<ListResponce> getLists();
    ListResponce getList(Long id);
    void deleteList(Long id);
    ListResponce createList(com.melikesivrikaya.toDoList.model.List list);
    ListResponce updateList(UpdateListRequest list);
    java.util.List<ListResponce> getListsByUserId(Long userId);

}
