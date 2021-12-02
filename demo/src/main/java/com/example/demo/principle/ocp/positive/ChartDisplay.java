package com.example.demo.principle.ocp.positive;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:43:35
 * @Description
 */
public class ChartDisplay {
    AbstractChart chart;

    public ChartDisplay(AbstractChart chart) {
        this.chart = chart;
    }

    public void display(){
        this.chart.display();
    }

}
