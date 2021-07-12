package com.learn.dp.strategy;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
