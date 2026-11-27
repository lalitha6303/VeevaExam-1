public class Main
{
    public static void main(String[] args)
    {
        PayrollManager pm =new PayrollManager();

        pm.addEmployee(new FullTimeEmployee(101, "Alice", "IT", 60000, 10000));
        pm.addEmployee(new ContractEmployee(102, "Bob", "IT", 500, 100));
        pm.addEmployee(new FullTimeEmployee(103, "Charlie", "HR", 55000, 5000));
        System.out.println("DeptWiseSalary");
        System.out.println(pm.DeptWiseTotalSalary());
        double threshold=5000;
        System.out.println("TopEarners");
        System.out.println(pm.TopEarners(threshold));

    }
}
