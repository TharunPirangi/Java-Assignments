package lambdas-streams.functions;
import java.util.*;
public class SupplierDemo {
    public static void main(String[] args)
    {
        Supplier<String> supplier=()->"No element found";
        List<Object> list= Arrays.asList("a");
       	System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
