package ATMProject;


import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OptionMenu extends Account{
    final Logger _log = Logger.getLogger(OptionMenu.class.getName());

    final Scanner menuInput = new Scanner(System.in);

    //for User & Password
    final HashMap<Integer, Integer> data = new HashMap<>();

    public void getLoin(){

        int x = 1;
        while (x == 1){

            try {

                //User: 952141 & Pass: 191904
                data.put(952141, 191904);
                data.put(988847, 71976);

                System.out.println("Welcome to the ATM Project");
                System.out.println("Enter your customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your PIN Number: ");
                setPinNumber(menuInput.nextInt());

            }catch (Exception e){
                _log.log(Level.INFO, "\" Invalid Character(s). Only Numbers.\"");
                x=2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();

            }else {
                _log.log(Level.INFO, "\" Wrong Customer Number or Pin Number\"");

            }
        }
    }

    public void getAccountType(){
        System.out.println(" Select the Account you Want to Access: ");
        System.out.println(" Type 1 - Checking Account");
        System.out.println(" Type 2 - Saving Account");
        System.out.println(" type 3 - EXIT");

        int selection = menuInput.nextInt();

        switch(selection){

            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank you for using ATM, bye." + "\n");
                break;

            default:
                _log.log(Level.INFO, "\" Invalid Choice.\"");
                getAccountType();
        }
    }

    public void getChecking(){
        System.out.println(" Checking Account: ");
        System.out.println(" Type 1 - View balance");
        System.out.println(" Type 2 - Withdraw Funds");
        System.out.println(" Type 3 - Deposit Funds");
        System.out.println(" type 4 - EXIT");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking Account balance: " + getCheckingBalance());
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using ATM, Bye. ");
                break;

            default:
                _log.log(Level.INFO, "\" Invalid Choice.\"");
                getChecking();
        }

    }

    public void getSaving(){
        System.out.println(" Checking Account: ");
        System.out.println(" Type 1 - View balance");
        System.out.println(" Type 2 - Withdraw Funds");
        System.out.println(" Type 3 - Deposit Funds");
        System.out.println(" type 4 - EXIT");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                getAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using ATM, Bye. ");
                break;

            default:
                _log.log(Level.INFO, "\" Invalid Choice.\"");
        }
    }



}
