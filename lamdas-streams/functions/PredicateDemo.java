package lambdas-streams.functions;
import java.util.*;
public class PredicateDemo {
    public static void main(String[] args)
    {
        Predicate<Integer> predicate=t->t%2==0;
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().filter(predicate).forEach(t->System.out.println("printing "+t));
    }
}
