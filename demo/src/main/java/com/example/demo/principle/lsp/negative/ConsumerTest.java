package com.example.demo.principle.lsp.negative;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 11:02:01
 * @Description 里氏替换原则
 *  新增一个至尊VIP消费者后，代码重复了
 */
public class ConsumerTest {
    public static void main(String[] args) {
        SendEmail service = new SendEmail();
        service.send(new CommonConsumer());
        service.send(new VipConsumer());

        //先增加一个至尊VIP顶级消费者，势必要再次添加重复的发送消息方法，因此需要进行重构
        service.send(new SuperConsumer());
    }
}
