package com.example.demo.principle.lsp.positive;

import lombok.Data;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 11:06:02
 * @Description
 */
@Data
public class SuperConsumer extends AbstractConsumer {

    protected void sendMessage() {
        System.out.println("-------至尊VIP消费者发送消息-------");
    }

}
