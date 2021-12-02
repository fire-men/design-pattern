package com.example.demo.principle.lsp.positive;

import lombok.Data;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:56:59
 * @Description
 */
@Data
public class CommonConsumer extends AbstractConsumer {

    protected void sendMessage() {
        System.out.println("-------普通消费者发送消息-------");
    }
}
