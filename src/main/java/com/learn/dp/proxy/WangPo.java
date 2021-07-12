package com.learn.dp.proxy;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class WangPo implements KindWomen{

    private final KindWomen kindWomen;

    WangPo(){
        kindWomen = new PanJinLian();
    }

    WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
