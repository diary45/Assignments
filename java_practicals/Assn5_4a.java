public class Assn5_4a {
    public static void main(String[] args) {
        Pair<String,String> pair=new Pair<>("1","Hello");


    }

}
class Pair<T,V>{
    T key;
    V value;
    Pair(T key,V value){
        this.key=key;
        this.value=value;
    }

}
