import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Assn6_4 {
    public static void main(String[] args) {
        List<LocalDate> dobs=new LinkedList<>();
        dobs.add(LocalDate.of(1999,2,23));
        dobs.add(LocalDate.of(1998,2,23));
        dobs.add(LocalDate.of(2004,3,29));
        dobs.add(LocalDate.of(1999,11,20));
        dobs.add(LocalDate.of(1944,12,12));
        dobs.add(LocalDate.of(2000,4,22));
        dobs.add(LocalDate.of(1999,1,6));
        for(var date:dobs){
            int y=date.getYear();
            if((y%4==0 && y%100!=0) ||(y%400==0)){
                System.out.println("your date of birth is "+date.getYear()+ " and it is a leap year");

            }
            else{
                System.out.println("your date of birth is "+date.getYear()+ " and it is not a leap year");

            }
        }

    }
}
