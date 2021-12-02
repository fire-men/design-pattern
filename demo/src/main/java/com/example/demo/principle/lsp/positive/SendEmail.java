package com.example.demo.principle.lsp.positive;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:57:44
 * @Description
 */
public class SendEmail {
    AbstractConsumer consumer;

    public SendEmail(AbstractConsumer consumer) {
        this.consumer = consumer;
    }

    public void send() {
      this.consumer.sendMessage();
    }
}
