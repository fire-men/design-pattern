package com.example.demo.principle.lsp.negative;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:57:44
 * @Description
 */
public class SendEmail {

    public void send(CommonConsumer consumer){
        System.out.println("-----------普通消费者发送消息-----------");
    }

    public void send(VipConsumer consumer){
        System.out.println("-----------VIP消费者发送消息-----------");
    }

    //新增至尊VIP顶级消费者
    public void send(SuperConsumer consumer){
        System.out.println("-----------至尊VIP消费者发送消息-----------");
    }
}
