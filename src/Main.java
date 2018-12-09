import java.util.ArrayList;

public class Main {

//  Можно создать массив или ArrayList типа Employee и добавить туда разные объекты.
//  Сделайте подсчет сколько денег нужно выплать в месяц всем рабочим.

  public static void main(String[] args) {


    ArrayList<Employee> employees = new ArrayList<>();

    employees.add(new Boss("Boss", "Bossovich", 10000));
    employees.add(new HourlyWorker("Ivan", "Ivanov", 20, 160, 15));
    employees.add(new HourlyWorker("Ivan", "Petrov", 20, 200, 15));
    employees.add(new HourlyWorker("Ivan", "Sidorov", 20, 100, 15));
    employees.add(new PieceWorker("Alex", "Alexov", 20, 100));
    employees.add(new PieceWorker("Dima", "Alexov", 20, 150));
    employees.add(new CommissionWorker("Inna", "Ivanova", 3000, 100, 20));
    employees.add(new CommissionWorker("Anna", "Petrova", 3000,100, 50));
    employees.add(new CommissionWorker("Zoya", "Vasichkina", 3000,100, 0));

    int totalSalary = 0;
    for (int i = 0; i < employees.size(); i++) {
        employees.get(i).printEmployee();
        totalSalary += employees.get(i).calculateSalary();
    }
    System.out.println("=======================================");
    System.out.println("$" + totalSalary);
  }


}
