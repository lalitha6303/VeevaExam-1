public class ContractEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    public ContractEmployee(int Id,String Name,String Department,double hourlyRate,int hoursWorked)
    {
        super(Id, Name, Department);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;

    }

    @Override
    public Double CalculateSalary() {
        return  hourlyRate*hoursWorked;
    }
}
