package com.example.demo.behavePattern.strategy;

/**
 * @Author zhangle
 * @CreateTime 2021-12-03 14:46:34
 * @Description 设计模式之策略模式
 *  特点：根据接口类型的不同实例执行不同的算法，灵活
 */
public class Test {

    public static void main(String[] args) {
//        Strategy addStrategy = (a, b) -> {
//            return a + b;
//        };
//
//        Strategy subtractStrategy = (a, b) -> {
//            return a - b;
//        };
//
//        Strategy multiplyStrategy = (a, b) -> {
//            return a * b;
//        };
//
//        Strategy divideStrategy = (a, b) -> {
//            return a / b;
//        };

        Strategy addStrategy = new AddStrategy();
        Strategy subtractStrategy = new SubtractStrategy();
        Strategy multiplyStrategy = new MultiplyStrategy();
        Strategy divideStrategy = new DivideStrategy();
        int a = 10;
        int b = 2;

        System.out.println(a +" + "+b+" = "+new Context(addStrategy).executeStrategy(a, b));
        System.out.println(a +" - "+b+" = "+new Context(subtractStrategy).executeStrategy(a, b));
        System.out.println(a +" * "+b+" = "+new Context(multiplyStrategy).executeStrategy(a, b));
        System.out.println(a +" / "+b+" = "+new Context(divideStrategy).executeStrategy(a, b));


    }
}
