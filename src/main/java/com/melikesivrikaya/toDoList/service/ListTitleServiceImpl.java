package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.repository.ListTitleRepository;
import com.melikesivrikaya.toDoList.response.ListTitleWithListResponce;
import com.melikesivrikaya.toDoList.response.ListResponce;
import com.melikesivrikaya.toDoList.response.ListTitleResponce;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ListTitleServiceImpl implements ListTitleService{
    private ListTitleRepository listTitleRepository;
    private ListService listService;

    @Override
    public List<ListTitleWithListResponce> getListTitles() {
        List<ListTitle> list = listTitleRepository.findAll();
        return list.stream().map(l -> {
            List<ListResponce> lists = listService.getListByListTitleId(l.getId());
                 return    new ListTitleWithListResponce(l,lists);
                }
        ).collect(Collectors.toList());
    }
    @Override
    public ListTitleResponce getListTitle(Long id) {
        ListTitle list = listTitleRepository.findById(id).get();
        return new ListTitleResponce(list);
    }
    @Override
    public void deleteListTitle(Long id) {
        //bu id ye ait list lerde silinmeli !!!!!!!!!!!!!!
        List<ListResponce>  lists = listService.getListByListTitleId(id);
        listTitleRepository.deleteById(id);
        lists.stream().forEach(l -> listService.deleteList(l.getId()));
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
    public List<ListTitleWithListResponce> getListTitlesByUserId(Long userId) {
        List<ListTitle> list = listTitleRepository.findAllByUserId(userId);
        return list.stream().map(l -> {
            List<ListResponce> lists = listService.getListByListTitleId(l.getId());
                  return new ListTitleWithListResponce(l,lists);
           }
        ).collect(Collectors.toList());
    }
}
