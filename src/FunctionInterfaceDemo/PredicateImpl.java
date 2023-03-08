package FunctionInterfaceDemo;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate {
    @Override
    public boolean test(Object o) {
        return false;
    }
}
