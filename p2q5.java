/*Create a superclass called Employee with two fields, name (String) and salary (double),
and a method getSalary() that returns the salary. Create a subclass called Manager that adds a
field bonus (double) and overrides getSalary() to return the salary and bonus sum. Create
another subclass called Executive that adds a field stockOptions (double) and overrides
getSalary() to return the sum of the salary, bonus, and stock options. Write a method in the
Employee class called printEmployeeInfo() that prints the name, salary, and title ("Employee",
"Manager", or "Executive") of the employee. Implement the appropriate constructors for all
classes. */

class Employee{
    String name;
    double salary;
    public Employee(String n,double s){
        name = n;
        salary = s;
    }
    public double getSalary(){
        return salary;
    }
    public void printEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Title: Employee");
    }
}
class Manager extends Employee{
    double bonus;
    public Manager(String n,double s,double b){
        super(n, s);
        bonus = b;
    }
    public double getSalary(){
        return super.getSalary()+bonus;
    }
    public void printEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Title: Manager");
    }
}
class Executive extends Manager{
    double stockOptions;
    public Executive(String n,double s,double b,double o){
        super(n, s, b);
        stockOptions = o;
    }
    public double getSalary(){
        return super.getSalary()+stockOptions;
    }
    public void printEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Title: Executive");
    }
}

public class p2q5 {
    public static void main(String[] args) {
        Employee e = new Employee("Ram", 10000.0);
        Manager m = new Manager("Sam", 100000.0, 1000.0);
        Executive ex = new Executive("Ron", 100000.0, 1000.0, 2000.0);
        e.printEmployeeInfo();
        m.printEmployeeInfo();
        ex.printEmployeeInfo();
    }
}
