package com.melikesivrikaya.toDoList.responce;

import com.melikesivrikaya.toDoList.model.ListTitle;
import lombok.Data;

@Data
public class ListTitleResponce {
    private Long id;
    private String listName;
    public ListTitleResponce(ListTitle listTitle){
        this.id = listTitle.getId();
        this.listName = listTitle.getListName();
    }
}
