import java.util.ArrayList;
import java.util.List;

public class Assn8_6 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>(List.of("hello", "hi", "bye"));

        l.replaceAll(String::toUpperCase);
        System.out.println(l);


    }
}
