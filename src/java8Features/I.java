package java8Features;
import java.util.Collection;
public interface I {
    void m1();
    default void m2 (){
        System.out.println("default implementation");
    }
}
