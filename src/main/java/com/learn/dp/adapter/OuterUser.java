package com.learn.dp.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title
 * @Description
 * @Author hdan
 * @Since 2021/7/13
 * @See
 */
public class OuterUser implements IOuterUser{
    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<>();

        baseInfoMap.put("userName", "这个员工叫混世魔王....");
        baseInfoMap.put("mobileNumber", "这个员工电话是....");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();

        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是....");

        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<>();

        homeInfo.put("homeTelNumbner", "员工的家庭电话是....");
        homeInfo.put("homeAddress", "员工的家庭地址是....");

        return homeInfo;
    }
}
