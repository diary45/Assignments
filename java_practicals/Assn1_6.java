import java.util.Scanner;

public class Assn1_6 {
  public static void main(String[] args) {
      String pass="hello",user="hello",ipass,iuser;
      Scanner s =new Scanner(System.in);
      int count=0,flag=0;
      while(true)
      {
        if(count==3){
            flag=1;
            break;
        }
      System.out.print("please enter username: ");
      iuser=s.nextLine();
      System.out.print("please enter password: ");
      ipass=s.nextLine();
      if(user.equals(iuser) && pass.equals(ipass))
      {
          break;
      }
      System.out.print("\033[H\033[2J");
      System.out.println("credentials didnt match please try again");

      count++;

      }
      if(flag==0){
        System.out.print("\033[H\033[2J");
        System.out.print("u have logged in succesfully");
      }
      else{
        System.out.print("three trials expired please contact admin");
      }
      s.close();
  }  
}
