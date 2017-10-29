package com.yespon.ssm.patterns.factory.abstractfactory;

import com.yespon.ssm.patterns.factory.IProduct;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class ProductFactory3 implements IProductFactory {
    @Override
    public IProduct createProduct(String productNo) {
        IProduct product = createProduct("");
        return product;
    }
}
