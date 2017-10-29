package com.yespon.ssm.patterns.observer;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class TestMain {
    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TaobaoObserver taobaoObserver = new TaobaoObserver();
        JingDongObserver jingDongObserver = new JingDongObserver();
        observable.addProductListObserver(taobaoObserver);
        observable.addProductListObserver(jingDongObserver);
        observable.addProduct("新增产品1");
    }
}
