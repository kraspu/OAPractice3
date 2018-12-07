import java.util.ArrayList;

public class Main {

//  Можно создать массив или ArrayList типа Employee и добавить туда разные объекты.
//  Сделайте подсчет сколько денег нужно выплать в месяц всем рабочим.

  public static void main(String[] args) {


    ArrayList<Employee> employees = new ArrayList<>();

    employees.add(new Boss(20,"Boss", "Bossovich", 10000));
    employees.add(new HourlyWorker(160, "Ivan", "Ivanov", 20));
    employees.add(new HourlyWorker(200, "Ivan", "Petrov", 20));
    employees.add(new HourlyWorker(100, "Ivan", "Sidorov", 20));
    employees.add(new PieceWorker(100, "Alex", "Alexov", 20));
    employees.add(new PieceWorker(150, "Dima", "Alexov", 20));
    employees.add(new CommissionWorker(20, "Inna", "Ivanova", 3000, 100));
    employees.add(new CommissionWorker(50, "Anna", "Petrova", 3000,100));
    employees.add(new CommissionWorker(0, "Zoya", "Vasichkina", 3000,100));

    int totalSalary = 0;
    for (int i = 0; i < employees.size(); i++) {
        employees.get(i).printEmployee();
        totalSalary += employees.get(i).calculateSalary();

    }
  }


}
