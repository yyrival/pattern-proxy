package org.study.proxy.dynamicproxy.myproxy;

import org.study.proxy.Person;
import org.study.proxy.dynamicproxy.jdkproxy.Girl;

public class MyProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new ZhenAiWang().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
