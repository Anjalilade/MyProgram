package FunctionInterfaceDemo;
import java.util.function.Predicate;
    public class predicateDemo2{
        public static  void main(String[] args) {


            //traditional way
            Predicate predicate=new PredicateImpl();


            //anonymous class way
            Predicate predicate1 =new Predicate(){
                @Override
                public boolean test(Object O){
                    return false;
                }
            };
            //lambda


            Predicate lambda = (object) -> false;
        }
    }
    class PeredicateImpl implements Predicate {
        @Override
        public boolean test(Object O) {
            return false;
        }
    }






