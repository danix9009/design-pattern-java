package com.learn.dp.factoryMethod;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class YellowHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("黄色人类会哭");
    }

    @Override
    public void cry() {
        System.out.println("黄色人类会大笑，幸福呀！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人类会说话，一般说的都是双字节");
    }
}
