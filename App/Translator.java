package App;

import java.util.List;

public interface Translator<T> {
    List<String> translate(T input);

    default void print(T input) {
        translate(input).forEach(System.out::println);
    }
}
