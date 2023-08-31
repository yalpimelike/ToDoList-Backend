package com.melikesivrikaya.toDoList.response;

import com.melikesivrikaya.toDoList.model.List;
import lombok.Data;


@Data
public class ListResponce {
    private Long id;
    private Long listNameId;
    private String task;
    private boolean state;
    public ListResponce(List list){
        this.id = list.getId();
        this.listNameId=list.getListNameId();
        this.task=list.getTask();
        this.state = list.isState();
    }
}
