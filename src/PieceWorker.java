
public class PieceWorker extends Employee {

  //служащим начисляется сдельная плата по количеству изготовленных изделий

  private int details;


  public PieceWorker(final String FIRST_NAME, final String LAST_NAME, double perDetail, int details) {
    super(FIRST_NAME, LAST_NAME, perDetail);
    setDetails(details);
  }

  public int getDetails() {
    return details;
  }

  public void setDetails(int details) {
    this.details = details;
  }

  @Override
  double calculateSalary() {
    return getSalary() * getDetails();
  }

}
