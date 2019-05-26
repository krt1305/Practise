package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExmaple {
    public static void main(String[] args) {
            List<String> names= Arrays.asList("ab","b","c");
            names.stream().filter(name -> !name.equals("b"))
                    .forEach(name-> System.out.println(name));
    }
}
