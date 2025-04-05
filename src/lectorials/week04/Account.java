package lectorials.week04;

class Account {
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

//    public boolean transfer(int amount, Account dest){
//        if(amount < 0 || amount > this.balance){
//            return false;
//        }else {
//            this.balance -= amount;
//            dest.setBalance(dest.getBalance() + amount);
//            return true;
//        }
//    }

    public boolean transfer(int amount, Account dest){
        if(!this.withdraw(amount)){
            return false;
        }else{
            dest.setBalance(dest.getBalance() + amount);
            return true;
        }
    }

}
