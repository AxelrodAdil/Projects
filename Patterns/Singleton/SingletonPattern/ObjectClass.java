package Patterns.Singleton.SingletonPattern;

public class ObjectClass {
    private static ObjectClass instance=new ObjectClass();

    private ObjectClass(){}

    public static ObjectClass getObj() {
        return instance;
    }

    public void msg() {
        System.out.println("Object Created...");
    }
}