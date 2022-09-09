package org.huaxu.fastjson;

import com.alibaba.fastjson2.JSON;

import java.time.LocalDateTime;

/**
 * @Author DongxuHua
 * @Date: 2022/9/7 5:16 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.fastjson
 */
public class TestJSON2 {

    public static void main(String[] args) {

        Bean bean = JSON.parseObject("{\"date\":\"20220-09-01 10:41:00\"}", Bean.class);

        System.out.println(bean.date);

    }

    public class Bean {

        public LocalDateTime date;

    }

}
