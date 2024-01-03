import java.util.Scanner;
public class login{
    static Scanner s = new Scanner(System.in);
    private String name = "Nirmal";
    private String Password ="Admin";
    static int n ;
    
    public boolean login1()
    {
        System.out.println("Enter your AdminName");
        String name = s.next();
        System.out.println("Enter your password");
        String  pass = s.next();
      if(this.name.equalsIgnoreCase(name) && Password.equalsIgnoreCase(pass))
      {
        System.out.println("********Welcome Admin*********");
        return true;
      }
       if(this.name.equalsIgnoreCase(name)==true && Password.equalsIgnoreCase(pass)==false)
       {
        System.out.println("unauthourized access...worng password");
       }
       else if(this.name.equalsIgnoreCase(name)==false && Password.equalsIgnoreCase(pass)==true)
       {
        System.out.println("unauthourized access...worng amdin name");
       }
        return false;
    }

    private String username = "Ram";
    private String userPassword ="User";
    public boolean login2()
    {
        System.out.println("Enter your userName");
        String username = s.next();
        System.out.println("Enter your userpassword");
        String  pass = s.next();
      if(this.username.equalsIgnoreCase(username) && userPassword.equalsIgnoreCase(pass))
      {
        System.out.println("********Welcome to NNN Rental's*********");
        return true;
      }
       if(this.username.equalsIgnoreCase(username)==true && userPassword.equalsIgnoreCase(pass)==false)
       {
        System.out.println("unauthourized access...worng password");
       }
       else if(this.username.equalsIgnoreCase(username)==false && userPassword.equalsIgnoreCase(pass)==true)
       {
        System.out.println("unauthourized access...worng user name");
       }
        return false;
    }
    

    CarRentalSystem rentalSystem = new CarRentalSystem();
    public void cho(){
        System.out.println("Enter chocie");
        n=s.nextInt();
         switch (n) {
            case 1:
                login1();
                break;
            case 2:
            login2();
                break;
         }

    }

}