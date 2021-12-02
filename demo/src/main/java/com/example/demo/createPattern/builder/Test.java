package com.example.demo.createPattern.builder;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 17:11:31
 * @Description 设计模式之建造者模式
 *  原理：将一个个的对象拼凑成最终的一个对象
 */
public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.package1();

        System.out.println("======================套餐1============================");
        //返回套餐1的价格
        Float price = meal.getPrice();
        System.out.println("套餐1的价格为"+price+"元人民币");
        //返回套餐1的食物组合列表
        meal.showItems();

        System.out.println();
        System.out.println("======================套餐2============================");
        Meal meal2 = mealBuilder.package2();
        //返回套餐2的价格
        price = meal2.getPrice();
        System.out.println("套餐2的价格为"+price+"元人民币");
        //返回套餐2的食物组合列表
        meal2.showItems();

    }
}
