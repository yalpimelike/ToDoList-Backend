package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.UserFoto;
import com.melikesivrikaya.toDoList.service.UserGalleryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "/gallery")
public class UserGalleryControllerImpl implements UserGalleryController{
    private UserGalleryService userGalleryService;
    @GetMapping("{userId}")
    @Override
    public List<UserFoto> getGalleryByUserId(@PathVariable Long userId) {
        return userGalleryService.getGalleryByUserId(userId);
    }
    @DeleteMapping("{id}")
    @Override
    public void deleteUserFoto(@PathVariable Long id) {
        userGalleryService.deleteUserFoto(id);
    }
    @PostMapping
    @Override
    public UserFoto cretaeUserFoto(@RequestBody UserFoto userFoto) {
        return userGalleryService.cretaeUserFoto(userFoto);
    }
}
