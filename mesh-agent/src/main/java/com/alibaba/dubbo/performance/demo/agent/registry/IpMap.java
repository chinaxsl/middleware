package com.alibaba.dubbo.performance.demo.agent.registry;/**
 * Created by msi- on 2018/5/6.
 */

import java.util.HashMap;

/**
 * @program: dubbo-mesh
 * @description: 初始化机器ip地址以及权重信息
 * @author: XSL
 * @create: 2018-05-06 10:36
 **/

public class IpMap {
    public static HashMap<String,Integer> serverWeigthMap = new HashMap<>();

    static {
        serverWeigthMap.put("192.0.0.1",60);
        serverWeigthMap.put("192.0.0.2",10);
        serverWeigthMap.put("192.0.0.3",80);
        serverWeigthMap.put("192.0.0.4",90);
    }
}
