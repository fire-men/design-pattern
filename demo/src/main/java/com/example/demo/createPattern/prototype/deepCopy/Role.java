package com.example.demo.createPattern.prototype.deepCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 15:11:57
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Cloneable {
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
