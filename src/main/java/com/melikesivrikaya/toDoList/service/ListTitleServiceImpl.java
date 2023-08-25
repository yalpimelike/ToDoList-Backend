package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.ListTitleRepository;
import com.melikesivrikaya.toDoList.responce.ListTitleResponce;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ListTitleServiceImpl implements ListTitleService{
    private ListTitleRepository listTitleRepository;
    @Override
    public List<ListTitleResponce> getListTitles() {
        List<ListTitle> list = listTitleRepository.findAll();
        return list.stream().map(l -> new ListTitleResponce(l)).collect(Collectors.toList());
    }
    @Override
    public ListTitleResponce getListTitle(Long id) {
        ListTitle list = listTitleRepository.findById(id).get();
        return new ListTitleResponce(list);
    }
    @Override
    public void deleteListTitle(Long id) {
        listTitleRepository.deleteById(id);
    }
    @Override
    public ListTitleResponce createListTitle(ListTitle listTitle) {
        listTitleRepository.save(listTitle);
        return new ListTitleResponce(listTitle);
    }
    @Override
    public ListTitleResponce updateListTitle(ListTitle listTitle) {
        listTitleRepository.save(listTitle);
        return new ListTitleResponce(listTitle);
    }

    @Override
    public List<ListTitleResponce> getListTitlesByUserId(Long userId) {
        List<ListTitle> list = listTitleRepository.findAllByUserId(userId);
        return list.stream().map(l -> new ListTitleResponce(l)).collect(Collectors.toList());
    }
}
