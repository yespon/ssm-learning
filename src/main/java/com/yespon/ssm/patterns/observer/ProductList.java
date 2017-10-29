package com.yespon.ssm.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class ProductList extends Observable {
    private List<String> productList = null;
    private static ProductList instance;

    /**构造函数私有化*/
    private ProductList() {
    }

    /**
     * 取得唯一实例
     * @return 产品列表唯一实例
     */
    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    /**
     * 增加观察者（）
     * @param observer
     */
    public void addProductListObserver(Observer observer) {
        this.addObserver(observer);
    }

    /**
     * 新增产品
     * @param newProduct 新产品
     */
    public void addProduct(String newProduct) {
        productList.add(newProduct);
        System.out.println("产品列表新增加了产品：" + newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);
    }
}
