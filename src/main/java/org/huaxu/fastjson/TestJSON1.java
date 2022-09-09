package org.huaxu.fastjson;

import com.alibaba.fastjson.JSON;

/**
 * @Author DongxuHua
 * @Date: 2022/9/7 5:21 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.fastjson
 */
public class TestJSON1 {

    public static void main(String[] args) {

        Bean bean = JSON.parseObject("{\"date\":\"2022-09-07T12:38:31.000+08:00\"}", Bean.class);

        System.out.println(bean.date);

    }

}
