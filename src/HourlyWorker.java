public class HourlyWorker extends Employee {


  //служащим начисляется почасовая з/п за часы, отработанные в основное время,
  // и повышенная плата за часы, отработанные сверхурочно


  public HourlyWorker(int hours, String FIRST_NAME, String LAST_NAME, double perHours) {
    super(hours, FIRST_NAME, LAST_NAME, perHours);
  }


  @Override
  double calculateSalary() {
    double salary;
    if (getDaysHoursDetails() / DECEMBER_DAYS <= 8) {
      return getSalary() * getDaysHoursDetails();
    }else {
      return getSalary() * DECEMBER_DAYS * (8 + (getDaysHoursDetails() / DECEMBER_DAYS - 8) * .15);
    }
  }


}
