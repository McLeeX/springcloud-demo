package me.lirx.springcloud.order.service;

import me.lirx.springcloud.item.base.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {
    @Autowired
    private RestTemplate restTemplate;

    public Item queryItemById(Long id) {
        return this.restTemplate.getForObject("http://item/item/"
                + id, Item.class);
    }
}
