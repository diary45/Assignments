import java.util.ArrayList;
import java.util.List;

public class Assn8_4 {
    public static void main(String[] args) {

        List<String> l=new ArrayList<String>(List.of("hello","my","name"));


        l.removeIf(item->item.length()%2!=0);
        System.out.println(l);
    }
}

