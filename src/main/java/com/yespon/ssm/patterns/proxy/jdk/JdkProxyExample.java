package com.yespon.ssm.patterns.proxy.jdk;

import com.yespon.ssm.patterns.proxy.HelloWorld;
import com.yespon.ssm.patterns.proxy.HelloWorldImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public class JdkProxyExample implements InvocationHandler {
    /**
     * 真实对象
     */
    private Object target = null;

    /**
     *
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之前的服务");
        /*相当于调用sayHelloWorld方法*/
        Object obj = method.invoke(target,args);
        System.out.println("在调度真实对象之后的服务");
        return obj;
    }


    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
    }
}
