package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.UserFoto;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserGalleryRepository extends JpaRepository<UserFoto,Long> {
    List<UserFoto> findAllByUserId(Long userId);
}
