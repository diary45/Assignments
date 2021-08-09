import java.util.Date;

public class Assn5_4b {
    public static void main(String[] args) {
        Pair<String, Date> pair=new Pair<>("1",new Date());


    }
    private static class Pair<T,V>{
        T key;
        V value;
        Pair(T key,V value){
            this.key=key;
            this.value=value;
        }

    }

}
