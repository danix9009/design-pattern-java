package com.learn.dp.builder;

import java.util.ArrayList;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/14
 * @See
 */
public class BMWBuilder extends CarBuilder{

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
