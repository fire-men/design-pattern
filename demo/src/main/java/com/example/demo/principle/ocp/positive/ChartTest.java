package com.example.demo.principle.ocp.positive;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:43:14
 * @Description 开闭原则测试
 *  此时新增折形图，没有改动ChartDisplay类中的代码，Ok
 */
public class ChartTest {
    public static void main(String[] args) {
        PieChart pieChart = new PieChart();
        BarChart barChart = new BarChart();
        new ChartDisplay(pieChart).display();
        new ChartDisplay(barChart).display();

        //新增折形图
        FoldChart foldChart = new FoldChart();
        new ChartDisplay(foldChart).display();
    }
}
