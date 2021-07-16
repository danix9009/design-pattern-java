package com.learn.dp.bridge;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/16
 * @See
 */
public class House extends Product{
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
