package org.study.proxy.dynamicproxy.myproxy;


import java.lang.reflect.Method;

public class ZhenAiWang implements MyInvocationHandler {
    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是珍爱网的,我要给你介绍对象");
        System.out.println("开始物色!");
    }

    private void after(){
        System.out.println("OK的话,准备办事,先偿后买");
    }
}
