public class Account {
    private int id;
    private String name;
    private double balance;
    private long accountCreated;

    public Account(int id, String name, double balance, long accountCreated){ //Constructor Method
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.accountCreated = accountCreated;
    }

    public void deposit(int depositAmount){ //Deposit Method
        this.balance += depositAmount;
        System.out.println("Your balance is now: " + this.balance);
    }

    public void withdraw(double withdrawAmount){ //Withdraw Mehthod
        if(withdrawAmount > this.balance){
            System.out.println("You don't have any money in your account!");
            System.out.println("Balance: " + this.balance);
        }else{
             this.balance -= withdrawAmount;
             System.out.println("Balance: " + this.balance);
        }
    }

    public Account setId(int id){ //Sets Id
        this.id = id;
        return this;
    }

    public Account setName(String name){ //Sets Name
        this.name = name;
        return this;
    }

    public Account setBalance(double balance){ //Sets Balance
        this.balance = balance;
        return this;
    }

    public void setAccountCreated(int accountCreated){ //Sets When the account was created
        this.accountCreated = accountCreated;
    }

    public int getId(){ //Gets Id
        return this.id;
    }
    public String getName(){ //Gets Name
        return this.name;
    }

    public double getBalance(){ //Gets Balance
        return this.balance;
    }

    public long getAccountCreated(){ //Gets Account Created Time
        return this.accountCreated;
    }
    public String toString(){ //toString method prints the variables from the object
        return "[ID: "+this.id+", NAME: "+this.name+", BALANCE: " + this.balance + ", CREATED_AT: " + this.accountCreated + "]";
    }


}
