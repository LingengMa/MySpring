package com.lingengma.aurora.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LingengMa
 * @date 2025/10/02 19:24
 * @Description:
 */


public abstract class BeforeInvocationHandlerAdapter implements InvocationHandler {

    public abstract void before(Object proxy, Method method, Object[] args);

    @Override
    public final Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(proxy, method, args);
        return method.invoke(proxy, args);
    }
}
