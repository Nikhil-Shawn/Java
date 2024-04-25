public class Bank {
    private String userName;
    private int balance;

    Bank(String userName, int balance){
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName(){
        return this.userName;
    }

    public int getBalance(){
        return this.balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        }else {
            System.out.println("enter amount more than 0");
        }

    }

    public void withdraw(int amount){
        if(this.balance > amount){
            this.balance = this.balance + amount;
        }else {
            System.out.println("need more balanace");
        }

    }

}
