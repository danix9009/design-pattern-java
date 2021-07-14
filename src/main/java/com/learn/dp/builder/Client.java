package com.learn.dp.builder;


/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public class Client {
    public static void main(String[] args) {
        /*
         * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
//        ArrayList<String> sequence = new ArrayList<>(); //存放run的顺序
//
//        sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
//        sequence.add("start"); //启动起来
//        sequence.add("stop"); //开了一段就停下来
//
//        //然后我们把这个顺序给奔驰车：
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        CarModel benz = benzBuilder.getCarModel();
//        benz.run();
//        System.out.println("----------");
//        CarBuilder bmwBuilder = new BMWBuilder();
//        bmwBuilder.setSequence(sequence);
//        CarModel bmw = bmwBuilder.getCarModel();
//        bmw.run();

        /*
         * 建造者模式最主要功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了；
         * 而工厂方法则重点是创建，你要什么对象我创造一个对象出来，组装顺序则不是他关心的。
         */
        Director director = new Director();

        //1W辆A类型的奔驰车
        for (int i = 0; i < 3; i++) {
            director.getABenzModel().run();
        }

        //100W辆B类型的奔驰车
        for (int i = 0; i < 3; i++) {
            director.getBBenzModel().run();
        }

        //1000W量C类型的宝马车
        for (int i = 0; i < 3; i++) {
            director.getCBMWModel().run();
        }
    }
}
