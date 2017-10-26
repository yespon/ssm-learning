package com.yespon.ssm.patterns.refelct;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/26
 */
public interface ReflectService {
    /**
     *
     * @param name
     */
    void sayHello(String name);

    /**
     *
     * @return
     */
    ReflectService getInstance();
}
