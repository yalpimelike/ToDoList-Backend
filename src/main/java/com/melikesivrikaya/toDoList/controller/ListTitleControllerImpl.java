package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.service.ListTitleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/listtitles")
public class ListTitleControllerImpl implements ListTitleController {
    private ListTitleService listTitleService;
    @GetMapping
    @Override
    public List<ListTitle> getListTitles() {
        return listTitleService.getListTitles();
    }
    @GetMapping("/{userId}")
    @Override
    public List<ListTitle> getListTitlesByUserId(@PathVariable Long userId) {
        return listTitleService.getListTitlesByUserId(userId);
    }
    @GetMapping(path = "/listtitle")
    @Override
    public Optional<ListTitle> getListTitle(@RequestParam(name = "id") Long id) {
        return listTitleService.getListTitle(id);
    }
    @DeleteMapping(path = "/listtitle")
    @Override
    public void deleteListTitle(@RequestParam(name = "id") Long id) {
        listTitleService.deleteListTitle(id);
    }
    @PostMapping
    @Override
    public ListTitle createListTitle(@RequestBody ListTitle listTitle) {
        return listTitleService.createListTitle(listTitle);
    }
    @PutMapping
    @Override
    public ListTitle updateListTitle(@RequestBody ListTitle listTitle) {
        return listTitleService.updateListTitle(listTitle);
    }

}
