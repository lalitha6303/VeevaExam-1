public class FullTimeEmployee extends Employee{
    private double baseSalary;
    private double  bonus;
    public FullTimeEmployee(int Id,String Name,String Department,double baseSalary,double bonus)
    {
        super(Id, Name, Department);
        this.baseSalary=baseSalary;
        this.bonus=bonus;

    }

    @Override
    public Double CalculateSalary() {
        return baseSalary+bonus;
    }
}
