class TicketPriceCalculate {
  // ...
  public double summerRate = 5;
  public double winterRate = 10;
  public double winterServiceCharge = 2;

  public double getTicketPrice(int quantity) {
    double charge;
    if (quantity >= 5 && quantity <= 100) {
      charge = quantity * summerRate;
    } else {
      charge = quantity * winterRate + winterServiceCharge;
    }
    return charge;
  }
}

class Stadium {
  public static void main(String[] args) {
      Double ticketPrice;
      TicketPriceCalculate ticket = new TicketPriceCalculate();
      ticketPrice = ticket.getTicketPrice(10);
      System.out.println(ticketPrice);
  }
}