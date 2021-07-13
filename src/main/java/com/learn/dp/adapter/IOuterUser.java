package com.learn.dp.adapter;

import java.util.Map;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public interface IOuterUser {
    //基本信息，比如名称，性别，手机号码了等
    Map getUserBaseInfo();

    //工作区域信息
    Map getUserOfficeInfo();

    //用户的家庭信息
    Map getUserHomeInfo();
}
