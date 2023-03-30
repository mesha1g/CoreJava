package Nine.Inheritance.Human;


public class Profesor extends Person{
    private double salaryAmount;


    public Profesor() {
        super();
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }




    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
