package Question1;

public class HelloBean {
    private String name;
    private String job;
    int height;

    public HelloBean(int height) {
        this.height = height;
    }

    public HelloBean(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String title;

    public String getName() {
        return name;
    }

    public HelloBean(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private HelloBean(String name, String job, int height) {
        this.name = name;
        this.job = job;
        this.height = height;
    }

    void sayHello(){
        System.out.println("hello "+name +" the"+job + " ur taller than "+ height);
    }

}
