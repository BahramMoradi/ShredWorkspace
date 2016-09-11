package ch5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by BAM on 24-08-2016.
 * using built in lambda
 */
public class BuiltInLambda {
    public enum PredicateType {
        NULL_CHECK,
        EMPTY_CHECK,
        NULL_AND_EMPTY_CHECK
    }

    Map<PredicateType, Predicate> map;


    public BuiltInLambda() {
        map = new HashMap<>();
        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmpty = nullCheck.and(emptyCheck);
        map.put(PredicateType.NULL_CHECK, nullCheck);
        map.put(PredicateType.EMPTY_CHECK, emptyCheck);
        map.put(PredicateType.NULL_AND_EMPTY_CHECK, nullAndEmpty);
    }

    public Predicate get(PredicateType type) {
        Predicate p = map.get(type);
        return p;
    }
}
