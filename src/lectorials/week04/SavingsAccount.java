package lectorials.week04;

public class SavingsAccount extends Account {
    // additional property
    private int minAmount;

//    @Override
//    public boolean withdraw(int amount){
//        if(amount < 0){
//            return false;
//        }else if(this.getBalance() - amount < minAmount){
//            return false;
//        }else if(amount > this.getBalance()){
//            return false;
//        }else{
//            int oldBalance = this.getBalance();
//            int newBalance = oldBalance - amount;
//            this.setBalance(newBalance);
//            return true;
//        }
//    }
    @Override
    public boolean withdraw(int amount){
        if(this.getBalance() - amount < minAmount){
            return false;
        }else{
            return super.withdraw(amount);
        }
    }


//    public boolean transfer(int amount, Account dest){
//        if(amount < 0 || amount > this.getBalance() || this.getBalance() - amount < minAmount){
//            return false;
//        }else {
//            this.setBalance(this.getBalance() - amount);
//            dest.setBalance(dest.getBalance() + amount);
//            return true;
//        }
//    }

}
