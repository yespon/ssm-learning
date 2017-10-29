package com.yespon.ssm.patterns.interceptor;

import java.lang.reflect.Method;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public class MyInterceptor implements Interceptor {
    /**
     * 真实对象调用前
     *
     * @param proxy
     * @param target
     * @param method
     * @param args
     * @return
     */
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法前逻辑");
        return false;
    }

    /**
     * 真实对象调用前及后
     *
     * @param proxy
     * @param target
     * @param method
     * @param args
     */
    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("取代了被代理对象的方法");
    }

    /**
     * 真实对象调用后
     *
     * @param proxy
     * @param target
     * @param method
     * @param args
     */
    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法后逻辑");
    }
}
