package com.learn.dp.proxy;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/12
 * @See
 */
public class XiMenQing {
    public static void main(String[] args) {
        //把王婆叫出来
        WangPo wangPo = new WangPo();

        //然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏:
        wangPo.makeEyesWithMan(); //看到没，虽然表面上时王婆在做，实际上爽的是潘金莲
        wangPo.happyWithMan();
    }
}
