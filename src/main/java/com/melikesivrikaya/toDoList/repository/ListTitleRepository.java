package com.melikesivrikaya.toDoList.repository;

import com.melikesivrikaya.toDoList.model.ListTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListTitleRepository extends JpaRepository<ListTitle,Long> {
}
