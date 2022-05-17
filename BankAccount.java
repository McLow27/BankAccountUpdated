import java.time.Instant;

public class BankAccount{
public static void main(String[] args) {

    Account a1 = new Account(202, "Mason", 250.5, Instant.now().getEpochSecond());

    System.out.println(a1.setName("Mason").setId(250).setBalance(2000.100));

    a1.withdraw(250.100);

    }
}