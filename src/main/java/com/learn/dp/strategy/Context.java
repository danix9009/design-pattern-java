package com.learn.dp.strategy;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class Context {
    //构造函数，你要使用那个妙计
    private final IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate(){
        this.strategy.operate();
    }
}
