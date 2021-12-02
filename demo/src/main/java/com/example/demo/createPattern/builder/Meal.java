package com.example.demo.createPattern.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 16:54:06
 * @Description
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 返回套餐总价格
     *
     * @return
     */
    public Float getPrice() {
        Float sum = 0.f;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            sum += item.getPrice();
        }
        return sum;
    }

    /**
     * 打印套餐信息
     */
    public void showItems() {
        items.stream().forEach(items-> System.out.println("items: name="+items.name()+" price="+items.getPrice()+" packing="+items.pack().pack()));
    }
}
