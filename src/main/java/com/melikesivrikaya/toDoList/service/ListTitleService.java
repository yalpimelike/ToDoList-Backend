package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.response.ListTitleWithListResponce;
import com.melikesivrikaya.toDoList.response.ListTitleResponce;

import java.util.List;

public interface ListTitleService {
    List<ListTitleWithListResponce> getListTitles();
    ListTitleResponce getListTitle(Long id);
    void deleteListTitle(Long id);
    ListTitleResponce createListTitle(ListTitle listTitle);
    ListTitleResponce updateListTitle(ListTitle listTitle);
    List<ListTitleWithListResponce> getListTitlesByUserId(Long userId);


}
