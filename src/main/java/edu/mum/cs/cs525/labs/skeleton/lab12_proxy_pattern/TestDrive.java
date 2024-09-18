package edu.mum.cs.cs525.labs.skeleton.lab12_proxy_pattern;

public class TestDrive {
    public static void main(String[] args) {
        // Create the virtual proxy
        ComplexInterface proxy = VirtualProxyHandler.createProxy();

        System.out.println("Proxy created. The real object is not created yet.");

        // The real object will be created only when we call this method
        proxy.veryComplicatedTask();

        // The real object is already created, so this time it won’t take 10 seconds
        proxy.veryComplicatedTask();
    }
}

