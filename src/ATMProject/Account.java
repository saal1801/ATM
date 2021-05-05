package ATMProject;


import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private int checkingBalance = 0;
    private int savingBalance = 0;

    final Scanner input = new Scanner(System.in);

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Calculating Withdrawing
    public int calcCheckingWithdraw(int amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public int calcSavingWithdraw(int amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    // Calculating Deposit
    public int calcCheckingDeposit(int amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }


    //business function
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Amount you want to withdraw from Checking Account: ");
        int amount = input.nextInt();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + checkingBalance);
        }else {
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + savingBalance);
        System.out.println("Amount you want to withdraw from saving Account: ");
        int amount = input.nextInt();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New saving Account Balance: " + savingBalance);
        } else {
            System.out.println("Balance Cannot be Negative. " + "\n");
        }
    }

        public void getCheckDepositInput() {
            System.out.println("Checking Account Balance: " + checkingBalance);
            System.out.println("Amount you want to Deposit from Checking Account: ");
            int amount = input.nextInt();

            if ((checkingBalance + amount) >= 0) {
                calcCheckingDeposit(amount);
                System.out.println("New Checking Account Balance: " + checkingBalance);
        }else {
                System.out.println("Balance Cannot be Negative. " + "\n");
            }
    }

    public void getSavingDepositInput() {
        System.out.println("Checking Account Balance: " + savingBalance);
        System.out.println("Amount you want to Deposit from Checking Account: ");
        int amount = input.nextInt();

        if ((savingBalance + amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + savingBalance);
        }else {
            System.out.println("Balance Cannot be Negative. " + "\n");
        }
    }





}