package com.learn.dp.singleton;

/**
 * @Title 通用单例模式
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class SingletonPattern {
    private static final SingletonPattern singletonPattern = new
            SingletonPattern();

    //限制住不能直接产生一个实例
    private SingletonPattern() {
    }

    public synchronized static SingletonPattern getInstance() {
        return singletonPattern;
    }
}
