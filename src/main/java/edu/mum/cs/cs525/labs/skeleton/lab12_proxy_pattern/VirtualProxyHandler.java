package edu.mum.cs.cs525.labs.skeleton.lab12_proxy_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class VirtualProxyHandler implements InvocationHandler {
    private ComplexInterface realObject = null; // Real object is not created initially

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (realObject == null) {
            System.out.println("Creating the real object...");
            realObject = new ComplexClass();  // Lazy initialization of the real object
        }
        return method.invoke(realObject, args);  // Forward method call to the real object
    }
}
