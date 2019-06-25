package com.njupt.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class mishu implements MethodInterceptor{


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       System.out.println("预约时间");
//       System.out.println(method);
//        System.out.println(objects);
       Object r = methodProxy.invokeSuper(o,objects);
       System.out.println("备注");
        return r;
    }
}
