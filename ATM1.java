import java.util.Scanner;
class Account {
    int withdraw(int balance) {
        System.out.println("Enter required amount");
        Scanner d = new Scanner(System.in);
        int amount = d.nextInt();
        if (amount <= balance) {
            System.out.println("Collect your cash");
            System.out.println("Amount Collected Successfully");
            System.out.println("Transaction Successful");
            System.out.println("THANK YOU");
            return balance - amount;
        } else {
            System.out.println("Insufficient funds");
            return balance;
        }
    }

    int deposit(int balance) {
        System.out.println("Enter the amount to be deposited");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance += amount;
        return balance;
    }

    int balance(int balance) {
        return balance;
    }
}

class ATM1 extends Account {
    public static void main(String args[]) {
        int balance = 10000;
        System.out.println("WELCOME TO KD ATM");
        while (true) {
            System.out.println("1.WITHDRAW\n2.DEPOSIT\n3.BALANCE ENQUIRY\n4.EXIT");
            System.out.println("Enter your choice of transaction");
            Scanner sc=new Scanner(System.in);
            int ch = sc.nextInt();
            ATM1 obj = new ATM1();
            switch (ch) {
                case 1:
                    balance = obj.withdraw(balance);
                    break;
                case 2:
                    balance = obj.deposit(balance);
                    System.out.println("Deposited Successfully");
                    System.out.println("The balance is: " + balance);
                    break;
                case 3:
                    System.out.println("Account Balance is: " + obj.balance(balance));
                    break;
                case 4:
                    System.out.println(" Thank you! VISIT AGAIN");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}