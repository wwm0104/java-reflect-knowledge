package reflect.proxytest;

import reflect.interfs.DynamicSubject;
import reflect.interfs.RealSubjectImpl;
import reflect.interfs.Subject;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        try {
            Subject rs=new RealSubjectImpl();//这里指定被代理类
            InvocationHandler ds=new DynamicSubject(rs);
            Class<?> cls=rs.getClass();
            System.out.println(cls.getName());
            //以下是一次性生成代理

            Subject subject=(Subject) Proxy.newProxyInstance(
                    cls.getClassLoader(),cls.getInterfaces(), ds);//等同于下面的方法
            //         Proxy.getProxyClass(loader, interfaces).getConstructor(new Class[] { InvocationHandler.class }).newInstance(new Object[] { handler });
            subject.request();//此时subject 已经不是原来的subject了,而是代理之后的subject

            //下载代理类源码
            byte[] bts = ProxyGenerator.generateProxyClass("$SubjectProxy", cls.getInterfaces());
            FileOutputStream fos = new FileOutputStream(new File("D:/temp/$SubjectProxy.class"));
            fos.write(bts);
            fos.flush();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
