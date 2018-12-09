public class HourlyWorker extends Employee {


  //служащим начисляется почасовая з/п за часы, отработанные в основное время,
  // и повышенная плата за часы, отработанные сверхурочно

  private int hours;
  private int percent;

  public HourlyWorker(final String FIRST_NAME, final String LAST_NAME, double perHours, int hours, int percent) {
    super(FIRST_NAME, LAST_NAME, perHours);
    setHours(hours);
    setPercent(percent / 100);
  }


  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public int getPercent() {
    return percent;
  }

  public void setPercent(int percent) {
    this.percent = percent;
  }

  @Override
  double calculateSalary() {
    if (getHours() / DECEMBER_DAYS <= HOURS_A_DAY) {
      return getSalary() * getHours();
    }else {
      return getSalary() * DECEMBER_DAYS * (HOURS_A_DAY + (getHours() / DECEMBER_DAYS - HOURS_A_DAY) * getPercent());
    }
  }


}
