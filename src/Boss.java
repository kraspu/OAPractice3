public class Boss extends Employee {

// класс Boss - начисляется еженедельный фиксированный оклад независимо от числа отработанных часов


  public Boss(int DECEMBER_DAYS, final String FIRST_NAME, String LAST_NAME, double fixedSalary) {
    super(DECEMBER_DAYS, FIRST_NAME, LAST_NAME, fixedSalary);
  }

  @Override
  double calculateSalary() {
    return getSalary() / 7. * DECEMBER_DAYS;
  }


}
