package com.learn.dp.bridge;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/16
 * @See
 */
public class Client {
    /*
     * 把Corp类以及它的两个实现类放到了Abstraction包中，把House以及相关的三个实现类放到了 Implementor 包中，这两个包分别对应了桥梁模式的业务抽象角色
     * （Abstraction）和业务实现角色（Implementor）。
     *
     * 业务抽象角色引用业务实现角色，或者说业务抽象角色的部分实现是由业务实现角色完成的。
     *
     */

    /*
     * 继承不能说它不好，非常好，但是有缺点的，我们可以扬长避短，对于比较明确不发生变化的，则通过继承来完成，
     * 若不能确定是否会发生变化的，那就认为是会发生变化，则通过桥梁模式来解决
     */

    public static void main(String[] args) {
        System.out.println("-------房地产公司是这个样子运行的-------");
        House house = new House();
        //先找到我的公司
        HouseCorp houseCorp =new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("-------服装公司是这样运行的-------");
        ClothesCorp clothesCorp = new ClothesCorp(new Clothes());
        clothesCorp.makeMoney();

    }
}
