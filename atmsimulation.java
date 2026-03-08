import java.util.Scanner;
class atm{

    double balance=1000;


    void checkbalance(){
         System.out.println("current balance:"+balance);
    }


    void amountdeposit(double amount){
        balance=balance+amount;
        System.out.println("amount deposited: "+amount);
    }
    
    void amountwithdraw(double amount){
        if(amount<=balance)
            {
            balance=balance-amount;
        System.out.println("amount withdrawn: "+amount);
        }
        else{
            System.out.println("insufficient balance");
        }

    }
}




public class atmsimulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        atm a=new atm();

        int choice;
        do{
            System.out.println("----ATM-----");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit amount");
            System.out.println("3.Withdraw amount");
            System.out.println("4.Exit");
            System.out.println("enter your choice");
            
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:a.checkbalance();
                        break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();    
                    a.amountdeposit(dep);
                        break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double w=sc.nextDouble();
                    a.amountwithdraw(w);
                        break;
                case 4:
                    System.out.println("Thank you");
                        break;
                default:
                    System.out.println("Invalid choice");

                    
            }
            
        }
        while(choice!=4);
    }
}
