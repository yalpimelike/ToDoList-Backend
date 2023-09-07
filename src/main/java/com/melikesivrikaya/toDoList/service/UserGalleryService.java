package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.UserFoto;

import java.util.List;

public interface UserGalleryService {
    List<UserFoto> getGalleryByUserId(Long userId);
    void deleteUserFoto(Long id);
    UserFoto cretaeUserFoto(UserFoto userFoto);
}
