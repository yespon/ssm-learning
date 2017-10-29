package com.yespon.ssm.patterns.factory.abstractfactory;

import com.yespon.ssm.patterns.factory.IProduct;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public interface IProductFactory {
    IProduct createProduct(String productNo);
}
