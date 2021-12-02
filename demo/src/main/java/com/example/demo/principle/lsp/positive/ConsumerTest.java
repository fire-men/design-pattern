package com.example.demo.principle.lsp.positive;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 11:02:01
 * @Description 里氏替换原则
 *  优点：
 *   通过继承方式，代码可以复用
 *   是对开闭原则的补充
 */
public class ConsumerTest {
    public static void main(String[] args) {
        CommonConsumer commonConsumer = new CommonConsumer();
        VipConsumer vipConsumer = new VipConsumer();
        new SendEmail(commonConsumer).send();
        new SendEmail(vipConsumer).send();

        //先增加一个至尊VIP顶级消费者
        SuperConsumer superConsumer = new SuperConsumer();
        new SendEmail(superConsumer).send();
    }
}
