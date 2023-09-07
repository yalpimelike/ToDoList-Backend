package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.UserFoto;

import java.util.List;

public interface UserGalleryController {
    List<UserFoto> getGalleryByUserId(Long userId);
    void deleteUserFoto(Long id);
    UserFoto cretaeUserFoto(UserFoto userFoto);
}
