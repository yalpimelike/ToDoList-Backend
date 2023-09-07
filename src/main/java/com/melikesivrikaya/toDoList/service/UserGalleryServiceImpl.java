package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.UserFoto;
import com.melikesivrikaya.toDoList.repository.UserGalleryRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UserGalleryServiceImpl implements UserGalleryService {
    private UserGalleryRepository userGalleryRepository;
    @Override
    public List<UserFoto> getGalleryByUserId(Long userId) {
        return userGalleryRepository.findAllByUserId(userId);
    }

    @Override
    public void deleteUserFoto(Long id) {
        userGalleryRepository.deleteById(id);
    }

    @Override
    public UserFoto cretaeUserFoto(UserFoto userFoto) {
        return userGalleryRepository.save(userFoto);
    }

}
