package reflect.po;

public class Grandfather {
    private String grandFatherName;

    public int grandFatherAge;

    String grandFatherAddress;

    public Grandfather(){

    }
    public Grandfather(int age){

    }
    public class GrandFatherPulic{
        int age;
    }
    class GrandFatherDefault{
        int age;
    }
    private class GrandFatherPrivate{
        int age;
    }

    public interface  GrandFatherInterPublic{
        String getName();
    }
     interface GrandFatherInterDefault{
         String getName();
     }

     private interface GrandFatherInterPrivate{
         String getName();
     }
}
