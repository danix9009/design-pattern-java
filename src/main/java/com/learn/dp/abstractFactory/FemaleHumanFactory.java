package com.learn.dp.abstractFactory;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public class FemaleHumanFactory extends AbstractHumanFactory{

    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
