package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.ListTitleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class ListTitleServiceImpl implements ListTitleService{
    private ListTitleRepository listTitleRepository;
    @Override
    public List<ListTitle> getListTitles() {
        return listTitleRepository.findAll();
    }
    @Override
    public Optional<ListTitle> getListTitle(Long id) {
        return listTitleRepository.findById(id);
    }
    @Override
    public void deleteListTitle(Long id) {
        listTitleRepository.deleteById(id);
    }
    @Override
    public ListTitle createListTitle(ListTitle listTitle) {
        return listTitleRepository.save(listTitle);
    }
    @Override
    public ListTitle updateListTitle(ListTitle listTitle) {
        return listTitleRepository.save(listTitle);
    }
}
