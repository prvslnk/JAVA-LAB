/*  Create a class Account having data members accNo, balance, timePeriod and intInYears(as static and initialize with 7.5%). The class should also contain the following methods: 
 float calculateInterst() which calculates and returns the interest amount. 
 void showAccDetails() which displays account number, balance and calculated interest amount. 
 static void changeIntRate(float newRate) which changes the interest rate to newRate. 
Create an array of object of the class Account. Store the details of each object through the parameterized constructor. Display all the account details by calling the method showAccDetails().Change the interest rate to a new one by calling the method 
changeIntRate(). Finally display the account details after the change in interest rate. 
*/

public class Account {
    int accNo;
    float balance;
    int timePeriod;
    static float intInYears = 7.5f;

    Account(int accNo, float balance, int timePeriod) {
        this.accNo = accNo;
        this.balance = balance;
        this.timePeriod = timePeriod;
    }

    float calculateInterest() {
        return (balance * timePeriod * intInYears) / 100;
    }

    void showAccDetails() {
        System.out.println("Account Number: " + accNo + "\t\t Balance:" + balance + accNo + "\t\t Interest:"
                + calculateInterest() + "\n");

    }

    static void changeIntRate(float newRate) {
        intInYears = newRate;
    }

    public static void main(String[] args) {
        // Create an array of Account objects
        Account[] accounts = new Account[3];
        accounts[0] = new Account(1, 10000.0f, 2);
        accounts[1] = new Account(2, 20000.0f, 3);
        accounts[2] = new Account(3, 15000.0f, 1);

        for (Account account : accounts) {
            account.showAccDetails();
        }

        changeIntRate(8.0f);

        for (Account account : accounts) {
            account.showAccDetails();
        }
    }
}
