import java.util.HashMap;
import java.util.Map;

public class Assn8_7 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("vishnu","-goodboy ");
        m.put("saiteja","-boy ");
        m.put("mohan","-singer ");
        m.put("luffy","-thopu ");
        var ms=m.entrySet();
        StringBuilder s=new StringBuilder("");
        ms.forEach(entry->s.append(new StringBuilder(entry.getKey()+entry.getValue())));
        System.out.println(s);

    }
}
