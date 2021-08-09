public class Assn2_6 {
    public static void main(String[] args) {
        persistence p1=new DatabasePersist();
        persistence p2=new FilePersist();
        p1.persist();
        p2.persist();
    }
    
}

abstract class persistence{
    abstract void persist();
}

class FilePersist extends persistence{
    @Override
    void persist(){
        System.out.println("file persistence");
    }

}
class DatabasePersist extends persistence{
    @Override
    void persist(){
        System.out.println("data persistence");
    }

}