public class Boss extends Employee {

// класс Boss - начисляется еженедельный фиксированный оклад независимо от числа отработанных часов


  public Boss(final String FIRST_NAME, final String LAST_NAME, double fixedSalary) {
    super(FIRST_NAME, LAST_NAME, fixedSalary);
  }

  @Override
  double calculateSalary() {
    return getSalary() / 7. * DECEMBER_DAYS;
  }


}
