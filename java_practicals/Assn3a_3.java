import java.util.Locale;

public class Assn3a_3 {
    public static void main(String[] args) {
        String s1="Java String Pool Refers to collection of strings stored in heap memory";
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s1.replace("a","$"));
        System.out.println(s1.contains("collection"));
    }
}
