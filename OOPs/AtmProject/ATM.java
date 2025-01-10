import java.util.*;
public class ATM {
    public static void main(String[] args) {
        AtmMachine atm= new AtmMachine();
        atm.balance=15003;
        atm.checkpin();
    }
}
class AtmMachine{
    float balance ;
    int pin =7896;

    public void checkpin(){
        try (Scanner scanf = new Scanner(System.in)) {
           System.out.println("Enter your pin: ");
            int enterpin= scanf.nextInt();

            if(enterpin==pin){

                menu();
            }else{
                System.out.println("Incorrect pin, please try again");
                System.exit(enterpin);
            }
        }
    }

    public void menu()
    {
       System.out.println("ATM Menu\n");
       System.out.println("1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit");

       System.out.println("Enter your Choice\n");
       try (Scanner scanf = new Scanner(System.in))
        {
            int choice = scanf.nextInt();
            switch (choice)
            {
                case 1: checkBalance(); break;
                case 2: withdraw(); break;
                case 3: deposit(); break;
                case 4: System.exit(0); break;
                default: System.out.println("Invalid choice, please try again"); break;
            }
        }

    }

    private void checkBalance()
    {
        System.out.println("Balance "+balance+"\n");
        menu();
    }

    public void deposit() {
        try (Scanner scanf = new Scanner(System.in)){
            System.out.println("Enter the Amount to deposit: ");
            float amount = scanf.nextFloat();
            balance+=amount;
            System.out.println("Deposite successful\n");
            System.out.println("Updated Balance: " + balance + "\n");
            menu();
        }
       
    }

    public void withdraw()
    {
        System.out.println("Enter Amount to withdraw :");
        try (Scanner scanf = new Scanner(System.in)) {
            float amount = scanf.nextFloat();
            if (amount > balance)
            {
                System.out.println("Insufficient funds");
            }
            else
            {
                balance -= amount;
                System.out.println("Transaction successful");
                   
            }
            menu();
        }   
    }
}

