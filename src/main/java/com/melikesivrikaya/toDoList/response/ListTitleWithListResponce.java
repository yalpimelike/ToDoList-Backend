package com.melikesivrikaya.toDoList.response;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.response.ListResponce;
import lombok.Data;

import java.util.List;

@Data
public class ListTitleWithListResponce {
    private Long id;
    private String listName;
    private List<ListResponce> listResponce;
    public ListTitleWithListResponce(ListTitle listTitle , List<ListResponce> listResponce){
        this.id = listTitle.getId();
        this.listName = listTitle.getListName();
        this.listResponce = listResponce;
    }
}
