package org.huaxu.designMode.templateMethod;

/**
 * @Author DongxuHua
 * @Date: 2022/9/7 4:01 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.designMode.templateMethod
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        // 煮水
        boilWater();
        // 泡茶
        brew();
        // 把茶倒进杯子
        pourInCup();
        if (customerWantsCondiments()){
            // 加柠檬
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

}
