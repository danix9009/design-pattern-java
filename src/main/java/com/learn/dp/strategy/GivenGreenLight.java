package com.learn.dp.strategy;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
