package com.yespon.ssm.patterns.proxy.jdk;

import static org.junit.Assert.*;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public class JdkProxyExampleTest {
    public void testJdkProxy() {
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
    }
}