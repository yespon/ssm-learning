package com.yespon.ssm.patterns.proxy.jdk;

import com.yespon.ssm.patterns.proxy.HelloWorld;
import com.yespon.ssm.patterns.proxy.HelloWorldImpl;

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