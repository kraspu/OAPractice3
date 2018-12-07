public class CommissionWorker extends Employee {


  //служащим начисляется базовая з/п плюс комиссионный процент от продаж.

  private double price;


  public CommissionWorker(int selledOver, String FIRST_NAME, String LAST_NAME, double baseSalary, double price) {

    super(selledOver, FIRST_NAME, LAST_NAME, baseSalary);
    setPrice(price);
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  double calculateSalary() {
    return getSalary() + getPrice() * getDaysHoursDetails();
  }


}
