class TicketPriceCalculate {
  // ...
  public double summerRate = 5;
  public double winterRate = 10;
  public double winterServiceCharge = 2;

  public double getTicketPrice(int quantity) {
    double charge;

    // move the if condition into a seperate method called isQuantity
    if (isQuantity(quantity)) {
      charge = summerCharge(quantity); // move summercharge calculation into a seperate method called summerCharge
    } else {
      charge = winterCharge(quantity); // move winterCharge calculation into a seperate method called winterCharge
    }
    return charge;
  }

  //isQuantity conditional method implementation
  private boolean isQuantity (int quantity) {
    return quantity >= 5 && quantity <= 100;
  }

  //summerCharge calculation method implentation
  private double summerCharge (int quantity) {
    return quantity * summerRate;
  }

  //winterCharge calculation method implementation
  private double winterCharge(int quantity) {
    return quantity * winterRate + winterServiceCharge;
  }

}

class Stadium {
  public static void main(String[] args) {
      Double ticketPrice;
      TicketPriceCalculate ticket = new TicketPriceCalculate(); // create an Object of TicketPriceCalculate class 
      ticketPrice = ticket.getTicketPrice(10); // call the method using create object and pass 10 as the parameter
      System.out.println(ticketPrice);
  }
}