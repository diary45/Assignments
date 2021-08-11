import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assn8_3 {
    public static void main(String[] args) {
        Consumer print=System.out::println;
        print.accept("hello");

        Supplier getRandom=java.lang.Math::random;
        print.accept(getRandom.get());

        String a="123";
        Predicate<String> stringEquals=a::equals;
        print.accept(stringEquals.test("123"));

    }
}
