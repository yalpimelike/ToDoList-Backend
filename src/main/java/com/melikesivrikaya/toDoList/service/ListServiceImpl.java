package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.List;
import com.melikesivrikaya.toDoList.repository.ListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class ListServiceImpl implements ListService{
    private ListRepository listRepository;
    @Override
    public java.util.List<List> getLists() {
        return listRepository.findAll();
    }

    @Override
    public Optional<List> getList(Long id) {
        return listRepository.findById(id);
    }

    @Override
    public void deleteList(Long id) {
    listRepository.deleteById(id);
    }

    @Override
    public List createList(List list) {
        return listRepository.save(list);
    }

    @Override
    public List updateList(List list) {
        return listRepository.save(list);
    }
}
