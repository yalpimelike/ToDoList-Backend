package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.List;
import com.melikesivrikaya.toDoList.repository.ListRepository;
import com.melikesivrikaya.toDoList.responce.ListResponce;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListServiceImpl implements ListService{
    private ListRepository listRepository;
    @Override
    public java.util.List<ListResponce> getLists() {
        java.util.List<List> lists = listRepository.findAll();
        return lists.stream().map(l -> new ListResponce(l)).collect(Collectors.toList());
    }

    @Override
    public ListResponce getList(Long id) {
    List list = listRepository.findById(id).get();
        return new ListResponce(list);
    }

    @Override
    public void deleteList(Long id) {
    listRepository.deleteById(id);
    }

    @Override
    public ListResponce createList(List list) {
        listRepository.save(list);
        return new ListResponce(list);
    }

    @Override
    public ListResponce updateList(List list) {
        listRepository.save(list);
        return new ListResponce(list);
    }

    @Override
    public java.util.List<ListResponce> getListsByUserId(Long userId) {
        java.util.List<List> lists = listRepository.findAllByUserId(userId);
        return lists.stream().map(l -> new ListResponce(l)).collect(Collectors.toList());
    }
/////////////////////////////////////////////////////
    @Override
    public java.util.List<ListResponce> getListByListTitleId(Long titleId) {
        java.util.List<List> list =  listRepository.findAllByListNameId(titleId);
        return list.stream().map(l -> new ListResponce(l)).collect(Collectors.toList());
    }
}
