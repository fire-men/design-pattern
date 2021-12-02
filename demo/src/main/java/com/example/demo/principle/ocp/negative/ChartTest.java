package com.example.demo.principle.ocp.negative;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:28:34
 * @Description 开闭原则
 *  弊端：新增一个折形图类，势必要修改ChartDisplay类的方法
 *  解决：将图表展示进行抽象化
 */
public class ChartTest {
    public static void main(String[] args) {
        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.display("bar");

    }
}
