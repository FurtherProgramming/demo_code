package lectorials.week03;

public class Main {

//    public static void main(String[] args) {
//        Switch s = new Switch();
//        s.turnON();
//        s.turnOFF();
//
//    }
    public static void main(String[] args) {
        Account myAccount = new Account("s1234567", "John Smith", 100);
        System.out.println(myAccount.getId());
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getBalance());

        myAccount.setID("s1234567");
        myAccount.setName("John Smith");
        myAccount.setBalance(100);

        System.out.println(myAccount.getId());
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getBalance());

        if(myAccount.deposit(-100)) {
            System.out.println("New Balance: " + myAccount.getBalance());
        }else{
            System.out.println("Deposit is not successful!");
            System.out.println("Current Balance: " + myAccount.getBalance());
        }


        if(myAccount.withdraw(50)) {
            System.out.println("New Balance: " + myAccount.getBalance());
        }else{
            System.out.println("Withdraw is not successful!");
        }

        Account theOtherAccount = new Account("s222", "Amy", 1000);
        myAccount.transfer(50, theOtherAccount);
        System.out.println("Current balance of my account: " + myAccount.getBalance());
        System.out.println("Current balance of Amy's account: " + theOtherAccount.getBalance());

        theOtherAccount = myAccount;
        System.out.println(theOtherAccount.getBalance());
        myAccount.setBalance(100);
        System.out.println(theOtherAccount.getBalance());
    }
}
