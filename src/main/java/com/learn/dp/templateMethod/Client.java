package com.learn.dp.templateMethod;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public class Client {
    public static void main(String[] args) {
        HummerH2Model h2 = new HummerH2Model();
        h2.run(); //H2型号的悍马跑起来

        HummerModel h1 = new HummerH1Model();
        h1.run();
    }
}
