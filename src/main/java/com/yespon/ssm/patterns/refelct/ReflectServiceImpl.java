package com.yespon.ssm.patterns.refelct;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public class ReflectServiceImpl implements ReflectService {
    private String name;

    public ReflectServiceImpl() {

    }

    public ReflectServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void sayHello(String name) {
        System.err.println("Hello " + name);
    }

    @Override
    public ReflectService getInstance() {
        ReflectService object = null;
        try {
            object = (ReflectService) Class.forName("com.yespon.ssm.patterns.refelct.ReflectServiceImpl").newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    /**
     *
     * @return
     */
    public ReflectService getInstance2() {
        ReflectService object = null;
        try {
            object = (ReflectService) Class.forName("com.yespon.ssm.patterns.refelct.ReflectServiceImpl").getConstructor(String.class).newInstance("yespon");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }

    /**
     *
     * @return
     */
    public Object reflectMethod() {
        Object object = null;
        try {
            ReflectServiceImpl target = new ReflectServiceImpl();
            Method method = ReflectService.class.getMethod("sayHello", String.class);
            object = method.invoke(target,"yespon");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return object;
    }
}
