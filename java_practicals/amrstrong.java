import java.util.Scanner;

public class amrstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=100;i<1000;i++)
        {
            if(amrstrong.isArmstrong(i))
            System.out.println(i);
        }
        s.close();

        
    }
    static boolean isArmstrong(int n)
    {
        int k=0,temp,a=n;
        while(n>0)
        {
            temp=n%10;
            k=k+(temp*temp*temp);
            n=n/10;

        }
        if(k==a)
        {
            return true;
        }
        return false;
    }
    
}
