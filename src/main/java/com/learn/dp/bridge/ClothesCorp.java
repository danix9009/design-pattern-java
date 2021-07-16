package com.learn.dp.bridge;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/16
 * @See
 */
public class ClothesCorp extends Corp{
    public ClothesCorp(Product product) {
        super(product);
    }
//    @Override
//    protected void produce() {
//        System.out.println("服装公司生产衣服...");
//    }
//
//    @Override
//    protected void sell() {
//        System.out.println("服装公司出售衣服...");
//    }

    //服装公司不景气，但怎么说也是赚钱行业也
    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}
