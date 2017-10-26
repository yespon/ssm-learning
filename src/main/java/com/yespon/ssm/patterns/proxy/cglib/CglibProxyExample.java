package com.yespon.ssm.patterns.proxy.cglib;

import com.yespon.ssm.patterns.refelct.ReflectService;
import com.yespon.ssm.patterns.refelct.ReflectServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public class CglibProxyExample implements MethodInterceptor {
    /**
     * 生成CGLIB代理对象
     * @param cls ——Class类
     * @return Class类的CGLIB代理对象
     */
    private Object getProxy(Class cls){
        /*
         * CGLIB enhancer 增强类对象
         */
        Enhancer enhancer = new Enhancer();
        /*
         * 设置增强类型
         */
        enhancer.setSuperclass(cls);
        /*
         * 定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
         */
        enhancer.setCallback(this);
        /*
         * 生成并返回代理对象
         */
        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * @param o 代理对象
     * @param method 方法
     * @param objects 方法参数
     * @param methodProxy 方法代理
     * @return 代理逻辑返回
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.err.println("调用真实对象前");
        /*CGLIB 反射调用真实对象方法*/
        Object result = methodProxy.invokeSuper(o,objects);
        System.err.println("调用真实对象后");
        return result;
    }

    public static void main(String[] args) {
        CglibProxyExample cglib = new CglibProxyExample();
        ReflectService obj = (ReflectService) cglib.getProxy(ReflectServiceImpl.class);
        obj.sayHello("yespon");
    }
}
