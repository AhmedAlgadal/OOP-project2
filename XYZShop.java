import java.util.Scanner;
public class XYZShop{
    String name;
    Customer c;
    Seller s;
    Scanner sc1;
    Scanner sc2;

    public XYZShop(){
         c = new Customer();
         s = new Seller();
         sc1 = new Scanner(System.in);
         sc2 = new Scanner(System.in);
    }
    


    void getStaring(){
        System.out.println("Regester as: ");
        System.out.println("1.Customer  2.Seller");
        int n = sc1.nextInt();
        if(n==1){
            System.out.println("Enter your name:");
            c.setuName(sc2.nextLine());
            System.out.println("Enter your Email:");
            c.setuEmail(sc2.nextLine()); //we must check the email format before we set it
            System.out.println("Enter your PassWord:");
            c.setuPassword(sc2.nextLine()); //must check also the password, cannot be separated by space
            System.out.println("Welcome "+ c.getuName()+" "+ c.getuEmail());
        }else if (n==2){
            System.out.println("Enter your name:");
            s.setuName(sc2.nextLine());
            System.out.println("Enter your Email:");
            s.setuEmail(sc2.nextLine());
            System.out.println("Enter your PassWord:");
            s.setuPassword(sc2.nextLine());
            System.out.println("Welcome "+ s.getuName()+" "+ s.getuEmail());
        }

    }
}