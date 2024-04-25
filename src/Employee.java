public class Employee {
    private String name;
    private short age;
    private int salary;
    private String location;
    protected static String CompanyName = "SAP";

    public Employee(String name, short age, int salary,
             String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(){
         this.salary = this.salary+10000;
    }

    int getSalary(){
        return this.salary;
    }

    static void annouceCompany(){
        System.out.println(CompanyName);
    }

}
