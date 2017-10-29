package com.yespon.ssm.patterns.interceptor;

import java.lang.reflect.Method;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public interface Interceptor {
    /**
     * 真实对象调用前
     * @param proxy
     * @param target
     * @param method
     * @param args
     * @return
     */
    boolean before(Object proxy, Object target, Method method, Object[] args);

    /**
     * 真实对象调用前及后
     * @param proxy
     * @param target
     * @param method
     * @param args
     */
    void around(Object proxy, Object target, Method method, Object[] args);

    /**
     * 真实对象调用后
     * @param proxy
     * @param target
     * @param method
     * @param args
     */
    void after(Object proxy, Object target, Method method, Object[] args);
}
