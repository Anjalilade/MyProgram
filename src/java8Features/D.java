package java8Features;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;

public class D implements I{
    @Override
    public void m1() {
        System.out.println("m1 in D");
    }

    @Override
    public void m2() {
        I.super.m2();
        System.out.println(" default m2 override in D");
    }
}
