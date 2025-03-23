package lectorials.week03;

public class Account {
    // attributes
    private String id;
    private String name;
    private int balance;


    // construtor
    // Method overloading
    public Account(){

    }
    public Account(String id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

//    public Account(String id, String comment){
//
//    }

    public Account(String id, String name, int balance) {
        this(id, name);
        this.balance = balance;
    }






    // methods
    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // setter
    public void setID(String newID){
        this.id = newID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean deposit(int amount){
        if(amount < 0){
            return false;
        }else {
            this.balance += amount;
            return true;
        }
    }

    public boolean withdraw(int amount){
        if(amount < 0){
            return false;
        }else if(amount > this.balance){
            return false;
        }else{
            this.balance -= amount;
            return true;
        }
    }

    public boolean transfer(int amount, Account dest){
        if(amount < 0 || amount > this.balance){
            return false;
        }else {
            this.balance -= amount;
            dest.balance += amount;
            return true;
        }
    }



    // NOT recommended to have main method here
    // You can have in-class main for simple testing during program development
    public static void main(String[] args) {
        Account myAccount = new Account("s1234567", "John Smith", 100);
        System.out.println(myAccount.id);
        System.out.println(myAccount.name);
        System.out.println(myAccount.balance);

        myAccount.id = "s1234567";
        myAccount.name = "John Smith";
        myAccount.balance = 100;

        System.out.println(myAccount.id);
        System.out.println(myAccount.name);
        System.out.println(myAccount.balance);
        Account dad = new Account("s111", "Bingo");

        System.out.println(dad.getBalance());

        Account account2 = new Account();

    }
}
