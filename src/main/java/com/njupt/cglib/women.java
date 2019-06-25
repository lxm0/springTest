package com.njupt.cglib;

import net.sf.cglib.proxy.Enhancer;

public class women {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(laozong.class);
        enhancer.setCallback(new mishu());
        laozong laozong =(laozong) enhancer.create();
        laozong.chifan();
    }
}
