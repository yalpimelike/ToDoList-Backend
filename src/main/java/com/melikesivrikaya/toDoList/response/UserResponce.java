package com.melikesivrikaya.toDoList.response;

import com.melikesivrikaya.toDoList.model.User;
import lombok.Data;

import java.io.Serializable;
@Data
public class UserResponce implements Serializable {
    private Long id;
    private String name;
    private String address;
    public UserResponce(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.address = user.getAddress();
    }
}
