package me.lirx.springcloud.item.controller;

import me.lirx.springcloud.item.base.entity.Item;
import me.lirx.springcloud.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("{id}")
    public Item queryItemById(@PathVariable Long id) {
        return itemService.queryItemById(id);
    }
}
