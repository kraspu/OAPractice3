public abstract class Employee {

  //В базовом классе определить 2 метода: расчет з/п сотрудника и вывод на экран имени и фамилии рабочего.

  final int DECEMBER_DAYS = 20;


  private int daysHoursDetails;
  private String firstName;
  private String lastName;
  private double salary;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getDaysHoursDetails() {
    return daysHoursDetails;
  }

  public double getSalary() {
    return salary;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee(int daysOrHours, final String FIRST_NAME, String LAST_NAME, double salary) {
    this.daysHoursDetails = daysOrHours;
    setFirstName(FIRST_NAME);
    setLastName(LAST_NAME);
    this.salary = salary;
  }

  abstract double calculateSalary();

  public void printEmployee() {
    System.out.println(getFirstName() + " " + getLastName() + " " + calculateSalary());
  }


}
