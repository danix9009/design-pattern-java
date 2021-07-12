package com.learn.dp.factoryMethod;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class WhiteHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void cry() {
        System.out.println("白色人类会大笑，侵略的笑声");
    }

    @Override
    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节！");
    }
}
