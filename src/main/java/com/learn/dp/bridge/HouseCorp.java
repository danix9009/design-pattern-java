package com.learn.dp.bridge;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/16
 * @See
 */
public class HouseCorp extends Corp{
    public HouseCorp(House house) {
        super(house);
    }
//    @Override
//    protected void produce() {
//        System.out.println("房地产公司盖房子...");
//    }
//
//    @Override
//    protected void sell() {
//        System.out.println("房地产公司出售房子...");
//    }

    //房地产公司很High了，赚钱，计算利润
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
