package com.melikesivrikaya.toDoList.responce;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.melikesivrikaya.toDoList.model.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

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
