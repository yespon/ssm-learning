package com.yespon.ssm.patterns.factory;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class ProductFactory {
    public static IProduct createProduct(String productNo) throws NotSupportedException {
        switch (productNo) {
            case "1": return new Product1();
            case "2": return new Product2();
            case "3": return new Product3();
            case "4": return new Product4();
            case "5": return new Product5();
            default: throw new NotSupportedException("未支持此编号产品生产。");
        }
    }
}
