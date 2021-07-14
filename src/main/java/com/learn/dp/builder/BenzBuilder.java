package com.learn.dp.builder;

import java.util.ArrayList;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/14
 * @See
 */
public class BenzBuilder extends CarBuilder{

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}
