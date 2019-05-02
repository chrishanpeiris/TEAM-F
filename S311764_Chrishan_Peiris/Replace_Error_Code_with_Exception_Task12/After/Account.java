class AccountInfo {
    int amount;
    int balance = 1000;

    int withdraw(int amount) {
        if (amount > balance) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }
}

class Account {
    public static void main(String[] args) {

        AccountInfo account = new AccountInfo();// created an object instance of AccountInfo class

        // add try catch methods handle exceptions
        try {
            int withdrawAuthorisation = account.withdraw(50 / 0);
            System.out.println(withdrawAuthorisation);
        }
        // catch the exeception and handle it as we want > here it will show an error
        // message rather than java exception
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
