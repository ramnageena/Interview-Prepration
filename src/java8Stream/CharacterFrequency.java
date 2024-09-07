package java8Stream;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str="Hello world";
        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c->!Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
