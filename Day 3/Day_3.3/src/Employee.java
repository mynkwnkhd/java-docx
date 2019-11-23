class Employee
{
    private String name;
    private int empid;
    private float salary;
    private Date joinDate;
    public Employee( )
    {
        this.name = new String( );
        this.empid = 0;
        this.salary = 0;
        this.joinDate = new Date( );
    }
    public Employee( String name, int empid, float salary, Date joinDate )
    {
        this.name = new String( name );
        this.empid = empid;
        this.salary = salary;
        this.joinDate = joinDate;
    }
    public Employee( String name, int empid, float salary , int day, int month, int year )
    {
        this.name = new String( name );
        this.empid = empid;
        this.salary = salary;
        this.joinDate = new Date( day, month, year );
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public int getEmpid() 
    {
        return empid;
    }
    public void setEmpid(int empid) 
    {
        this.empid = empid;
    }
    public float getSalary() 
    {
        return salary;
    }
    public void setSalary(float salary) 
    {
        this.salary = salary;
    }
    public Date getJoinDate() 
    {
        return joinDate;
    }
    public void setJoinDate(Date joinDate) 
    {
        this.joinDate = joinDate;
    }
}