public class Employee extends Person{
    double salary;

    Employee(){
        super("dpoint");
        System.out.println("in the default constructor of Emp");
    }

    Employee(double isalary){//abcd=10
        super("dpoint",2);
        salary = isalary; //class var salary = abcd =10, salary =10
        System.out.println("parametarized constructor of Emp");
    }
    Employee(String iname,int iage, double isalary){//abcd=10
        super(iname,iage);
        salary = isalary; //class var salary = abcd =10, salary =10
        System.out.println("parametarized constructor of Emp");
    }

    double getSalary(){
        return salary;
    }
}