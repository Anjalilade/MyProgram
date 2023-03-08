package java8Features;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Demo {
    public static void main(String[] args) {

    }
}
interface StringProducer{
    //void produce();
    default void producer(){
        System.out.println("String are produced");
    }
}
interface StringProducer1{
    //void produce();
    default void producer(){
        System.out.println("String are produced");
    }
}
class StingProducerImpl implements StringProducer, StringProducer1{
    @Override
    public void producer() {
        StringProducer.super.producer();
        StringProducer1.super.producer();
    }
}

