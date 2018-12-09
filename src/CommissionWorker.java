public class CommissionWorker extends Employee {


  //служащим начисляется базовая з/п плюс комиссионный процент от продаж.

  private double price;
  private int soldOver;


  public CommissionWorker(final String FIRST_NAME, final String LAST_NAME,
                          double baseSalary, double price, int soldOver) {

    super(FIRST_NAME, LAST_NAME, baseSalary);
    setPrice(price);
    setSoldOver(soldOver);
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getSoldOver() {
    return soldOver;
  }

  public void setSoldOver(int soldOver) {
    this.soldOver = soldOver;
  }

  @Override
  double calculateSalary() {
    return getSalary() + getPrice() * getSoldOver();
  }


}
