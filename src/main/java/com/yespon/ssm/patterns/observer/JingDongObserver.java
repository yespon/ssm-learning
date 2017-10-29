package com.yespon.ssm.patterns.observer;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.Observer;

/**
 * @author liuyp
 * @package ${PACKAGE}
 * @date 2017/10/27
 */
public class JingDongObserver implements Observer {

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(java.util.Observable o, Object arg) {
        String newProduct = (String) arg;
        System.err.println("发送新产品【"+newProduct+"】同步到京东商城");
    }
}
