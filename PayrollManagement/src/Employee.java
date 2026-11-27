public abstract class Employee {
    private int Id;
    private String Name;
    private String Department;
    public Employee(int Id,String Name,String Department)
    {
        this.Id=Id;
        this.Name=Name;
        this.Department=Department;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
  public abstract Double CalculateSalary();

}
