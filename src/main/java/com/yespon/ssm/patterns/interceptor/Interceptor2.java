package com.yespon.ssm.patterns.interceptor;

import java.lang.reflect.Method;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class Interceptor2 implements Interceptor {
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
        System.out.println("【拦截器2】的before方法");
        return true;
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
        System.out.println("【拦截器2】的after方法");
    }
}
