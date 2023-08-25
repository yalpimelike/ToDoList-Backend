package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.List;
import com.melikesivrikaya.toDoList.service.ListService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@AllArgsConstructor
@RequestMapping(path = "/lists")
public class ListControllerImpl implements ListController{
    private ListService listService;
    @GetMapping
    @Override
    public java.util.List<List> getLists() {
        return listService.getLists();
    }
    @GetMapping(path = "/list")
    @Override
    public Optional<List> getList(@RequestParam(name = "id") Long id) {
        return listService.getList(id);
    }
    @DeleteMapping(path = "/list")
    @Override
    public void deleteList(@RequestParam(name = "id") Long id) {
        listService.deleteList(id);
    }
    @PostMapping
    @Override
    public List createList(@RequestBody List list) {
        return listService.createList(list);
    }
    @PutMapping
    @Override
    public List updateList(@RequestBody List list) {
        return listService.updateList(list);
    }
    @GetMapping("/{userId}")
    @Override
    public java.util.List<List> getListsByUserId(@PathVariable Long userId) {
        return listService.getListsByUserId(userId);
    }
}
