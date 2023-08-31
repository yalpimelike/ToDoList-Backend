package com.melikesivrikaya.toDoList.controller;

import com.melikesivrikaya.toDoList.model.ListTitle;
import com.melikesivrikaya.toDoList.repository.ListTitleWithListResponce;
import com.melikesivrikaya.toDoList.response.ListTitleResponce;
import com.melikesivrikaya.toDoList.service.ListTitleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/listtitles")
public class ListTitleControllerImpl implements ListTitleController {
    private ListTitleService listTitleService;
    @GetMapping
    @Override
    public List<ListTitleWithListResponce> getListTitles() {
        return listTitleService.getListTitles();
    }
    @GetMapping("/{userId}")
    @Override
    public List<ListTitleWithListResponce> getListTitlesByUserId(@PathVariable Long userId) {
        return listTitleService.getListTitlesByUserId(userId);
    }
    @GetMapping(path = "/listtitle")
    @Override
    public ListTitleResponce getListTitle(@RequestParam(name = "id") Long id) {
        return listTitleService.getListTitle(id);
    }
    @DeleteMapping(path = "/listtitle")
    @Override
    public void deleteListTitle(@RequestParam(name = "id") Long id) {
        listTitleService.deleteListTitle(id);
    }
    @PostMapping
    @Override
    public ListTitleResponce createListTitle(@RequestBody ListTitle listTitle) {
        return listTitleService.createListTitle(listTitle);
    }
    @PutMapping
    @Override
    public ListTitleResponce updateListTitle(@RequestBody ListTitle listTitle) {
        return listTitleService.updateListTitle(listTitle);
    }

}
