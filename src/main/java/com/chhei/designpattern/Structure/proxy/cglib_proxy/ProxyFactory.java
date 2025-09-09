package com.chhei.designpattern.Structure.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TrainStation.class);

        enhancer.setCallback(this);

        TrainStation proxyObject = (TrainStation) enhancer.create();

        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定服务费用，cglib动态代理");
        Object obj = method.invoke(station,objects);
        return obj;
    }
}
