package com.learn.dp.abstractFactory;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YellowMaleHuman("com.learn.dp.abstractFactory.YellowMaleHuman"),

    YellowFemaleHuman("com.learn.dp.abstractFactory.YellowFemaleHuman")
    ;


    private final String type;

    HumanEnum(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
