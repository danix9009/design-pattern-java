package com.learn.dp.abstractFactory;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public abstract class AbstractWhiteHuman implements Human{
    public void cry() {
        System.out.println("白色人类会哭");
    }

    public void laugh() {
        System.out.println("白色人类会大笑，侵略的笑声");
    }
    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节！");
    }
}
