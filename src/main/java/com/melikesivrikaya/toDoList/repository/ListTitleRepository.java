package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.ListTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListTitleRepository extends JpaRepository<ListTitle,Long> {
    List<ListTitle> findAllByUserId(Long userId);
}
