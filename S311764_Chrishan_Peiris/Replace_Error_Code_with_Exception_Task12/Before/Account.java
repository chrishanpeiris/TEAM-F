class AccountInfo {
    int amount;
    int balance = 1000;

    int withdraw(int amount) {
        if (amount > balance) {
          return -1;
        }
        else {
          balance -= amount;
          return 0;
        }
      }
  }

  class Account {
      public static void main(String[] args) {
          AccountInfo account = new AccountInfo();
          int withdrawAuthorisation = account.withdraw(1500);
          System.out.println(withdrawAuthorisation);
      }
  }
  