import java.util.Scanner;
import java.lang.Math;
public class interest {
   
    public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        double p,r,t,si,ci,temp;
        p=s.nextDouble();
        t=s.nextDouble();
        r=s.nextDouble();
        si=(p*t*r/100);
        temp=Math.pow(1+r, t);
        ci=p*temp;
        System.out.print("compound interest is "+ci);
        System.out.print("simple interest is "+si);
        



        


    }
    
}
