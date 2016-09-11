import ch5.BuiltInLambda;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Stream;
import ch5.BuiltInLambda.PredicateType;

public class Main {

    public static void main(String[] args) {
       // BuiltInLambda bil=new BuiltInLambda();
        /**
        PrintStream out=System.out;

           // Stream.of("Helllo", "hhhhh", null).filter(bil.get(PredicateType.NULL_CHECK)::test).forEach(out::println);
        Predicate<String> nCheck=arg->arg!=null;
        Predicate<String> eCheck=arg-> arg.length()>0;
        Predicate<String> nAnE=nCheck.and(eCheck);
        Stream<String> str=Stream.of("H",null,"");
        out.println("null Check");
        str.filter(nCheck::test).forEach(out::println);
        out.println("empty check");
        str.filter(eCheck::test).forEach(out::println);
        out.println("null and empty check");**/

        String line="258232,8401092014      220920,00       37002,84      160,00      150,001      258232";
        String [] tokken=line.split("\\t");
        StringTokenizer tokenizer=new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
        System.out.println(tokenizer.nextToken());
        }





    }

}
