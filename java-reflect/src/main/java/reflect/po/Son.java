package reflect.po;

public class Son extends Father{
    private String sonName;

    public int sonAge;

     String sonAddress;
    public Son(){

    }
    private Son(String name){

    }
    public Son(int age){

    }
    public class SonPulic{
        int age;
    }
    class SonDefault{
        int age;
    }
    private class SonPrivate{
        int age;
    }

    public interface  SonInterPublic{
        String getName();
    }
    interface SonInterDefault{
        String getName();
    }

    private interface SonInterPrivate{
        String getName();
    }
}
