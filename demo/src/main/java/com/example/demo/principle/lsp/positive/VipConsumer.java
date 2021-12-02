package com.example.demo.principle.lsp.positive;

import lombok.Data;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:57:14
 * @Description
 */
@Data
public class VipConsumer extends AbstractConsumer {

    protected void sendMessage() {
        System.out.println("-------VIP消费者发送消息-------");
    }
}
