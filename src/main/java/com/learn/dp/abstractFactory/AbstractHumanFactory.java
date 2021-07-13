package com.learn.dp.abstractFactory;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public abstract class AbstractHumanFactory implements HumanFactory{
    public Human createHuman(HumanEnum humanEnum){
        Human human = null;
        if (!humanEnum.getType().equals("")){
            try {
                //直接产生一个实例
                human = (Human)
                        Class.forName(humanEnum.getType()).newInstance();
            } catch (Exception e) {
                //因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
                e.printStackTrace();
            }
        }
        return human;
    }
}
