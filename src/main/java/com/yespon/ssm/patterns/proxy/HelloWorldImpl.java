package com.yespon.ssm.patterns.proxy;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }
}
