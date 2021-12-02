package com.example.demo.createPattern.builder;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 17:05:58
 * @Description
 */
public class MealBuilder {

    /**
     * 套餐1 = 牛肉汉堡 + 百事可乐
     *
     * @return
     */
    public Meal package1() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    /**
     * 套餐2 = 鸡肉汉堡 + 芬达
     *
     * @return
     */
    public Meal package2() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Fanta());
        return meal;
    }
}
