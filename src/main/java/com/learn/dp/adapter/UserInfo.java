package com.learn.dp.adapter;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public class UserInfo implements IUserInfo{
    @Override
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工的家庭电话是....");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是0000....");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室电话是....");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("姓名叫做...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是....");
        return null;
    }
}