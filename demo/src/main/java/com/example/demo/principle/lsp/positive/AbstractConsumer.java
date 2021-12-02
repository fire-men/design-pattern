package com.example.demo.principle.lsp.positive;

import lombok.Data;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 11:09:20
 * @Description
 */
@Data
public abstract class AbstractConsumer {
    protected String name;
    protected String email;

    abstract protected void sendMessage();

}
