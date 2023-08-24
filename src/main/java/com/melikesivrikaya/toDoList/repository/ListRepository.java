package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<List,Long> {
}
