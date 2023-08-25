package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.responce.ListTitleResponce;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface ListTitleService {
    List<ListTitleResponce> getListTitles();
    ListTitleResponce getListTitle(Long id);
    void deleteListTitle(Long id);
    ListTitleResponce createListTitle(ListTitle listTitle);
    ListTitleResponce updateListTitle(ListTitle listTitle);
    List<ListTitleResponce> getListTitlesByUserId(Long userId);
}
