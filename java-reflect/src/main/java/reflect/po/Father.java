package reflect.po;

public class Father extends  Grandfather{
    public Father (){

    }
    public Father(int age){

    }
    public class FatherPulic{
        int age;
    }
    class FatherDefault{
        int age;
    }
    private class FatherPrivate{
        int age;
    }

    public interface  FatherInterPublic{
        String getName();
    }
    interface FatherInterDefault{
        String getName();
    }

    private interface FatherInterPrivate{
        String getName();
    }
}
