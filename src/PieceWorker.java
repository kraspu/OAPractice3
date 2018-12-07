
public class PieceWorker extends Employee {

  //служащим начисляется сдельная плата по количеству изготовленных изделий


  public PieceWorker(int details, String FIRST_NAME, String LAST_NAME, double perDetail) {
    super(details, FIRST_NAME, LAST_NAME, perDetail);
  }

  @Override
  double calculateSalary() {
    return getSalary() * getDaysHoursDetails();
  }

}
