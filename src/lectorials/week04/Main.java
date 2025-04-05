package lectorials.week04;

public class Main {
    public static void testDeposit(Account testAccount){
        testAccount.setBalance(100);
        testAccount.deposit(100);
//        testAccount.addInterest();
        if(testAccount.getBalance() == 200){
            System.out.println("Test Successful");
        }else{
            System.out.println("Test Failed");
        }
    }

    public static void testAddInterest(SavingsAccount testAccount){
        // test the functionality of interest accumulation
    }



    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.deposit(100);
        System.out.println(account1.getBalance());

        SavingsAccount account2 = new SavingsAccount();
        account2.transfer(100, account1);

        Restaurant restaurant = new Restaurant();
        restaurant.sayHello();

        JapaneseRestaurant restaurant2 = new JapaneseRestaurant();
        restaurant2.sayHello();

        ItalianRestaurant italianRestaurant = new ItalianRestaurant();
        italianRestaurant.sayHello();

        Account account3 = new SavingsAccount();
        // Below is Not allowed
//        SavingsAccount account4 = new Account();
        SavingsAccount account5 = (SavingsAccount) account3;

        Account account6 = new Account();
        testDeposit(account6);
        SavingsAccount account7 = new SavingsAccount();
        // Passing savingsaccount to a method that expects account data type
        testDeposit(account7);
        testAddInterest(account7);
//        testAddInterest(account6);


    }
}
