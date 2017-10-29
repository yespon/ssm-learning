package com.yespon.ssm.patterns.builder;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class TicketHelper {

    public void buildAdult(String info) {
        System.err.println("构建成年人票逻辑： " + info);
    }

    public void buildChildrenForSet(String info) {
        System.err.println("构建有座儿童票逻辑： " + info);
    }

    public void buildChildrenNoSet(String info) {
        System.err.println("构建无座儿童票逻辑： " + info);
    }

    public void buildElderly(String info) {
        System.err.println("构建老年人票逻辑： " + info);
    }

    public void buildSoldier(String info) {
        System.err.println("构建军人及其家属票逻辑： " + info);
    }
}
