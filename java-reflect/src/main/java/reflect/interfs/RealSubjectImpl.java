package reflect.interfs;

public class RealSubjectImpl implements Subject {
    @Override
    public void request() {
        System.out.println("原始方法");
    }
}
