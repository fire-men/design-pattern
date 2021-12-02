package com.example.demo.principle.ocp.negative;

/**
 * @Author zhangle
 * @CreateTime 2021-12-02 10:23:16
 * @Description 图表展示类
 */
public class ChartDisplay {

    public void display(String type){
       if("pie".equals(type)){
           System.out.println("----------饼状图展示---------");
       }else if ("bar".equals(type)) {
           System.out.println("----------柱形图展示---------");
         //违反开闭原则
       }else if ("fold".equals(type)) {
           System.out.println("----------折形图展示---------");
       }
    }
}
