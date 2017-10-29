package com.yespon.ssm.patterns.builder;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class TicketBuilder {
    public static Object builder(TicketHelper helper) {
        System.out.println("通过TicketHelper构建套票信息");
        return null;
    }

    public static void main(String[] args) {
        TicketHelper helper = new TicketHelper();
        helper.buildAdult("成人票");
        helper.buildChildrenForSet("有座儿童票");
        helper.buildChildrenNoSet("无座儿童票");
        helper.buildElderly("老人票");
        helper.buildSoldier("军人票");
        Object ticket = TicketBuilder.builder(helper);
    }
}
