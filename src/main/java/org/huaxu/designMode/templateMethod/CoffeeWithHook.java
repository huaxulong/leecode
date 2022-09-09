package org.huaxu.designMode.templateMethod;

/**
 * @Author DongxuHua
 * @Date: 2022/9/7 4:08 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.designMode.templateMethod
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        System.out.println("是否添加糖或者牛奶 true or false 由子类决定");
        return true;
    }


}
