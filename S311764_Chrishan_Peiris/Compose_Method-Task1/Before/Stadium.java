class Stadium {
  // ...
  public double summerRate;
  public double winterRate;
  public double winterServiceCharge;

  public double getTicketPrice(Date date, int quantity) {
    double charge;
    if (date.before(WINTER_START) || date.after(WINTER_END)) {
      charge = quantity * summerRate;
    }
    else {
      charge = quantity * winterRate + winterServiceCharge;
    }
    return charge;
  }
}