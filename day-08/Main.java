public class Main{

    public static int add(int a, int b){
        System.out.println(" in method add with int a and int b");
        return a+b;
    }

    //overloading
    public static String add(String a,String b){
        return a+b;
    }

    //overloading
    public static int add(int a, int b, int c){
        System.out.println(" in method add with int a and int b and int c");
        return a+b+c;
    }

    public static void main(int x){}

    public static void main(String args[]){
        Employee e1 = new Employee("dpoint",5,10.0);
        e1.setName("updatedname");

        int result = add(1,2);
        System.out.println(result);

        int result2 = add(1,2,3);
        System.out.println(result2);


//        Person person1 = new Person("dpoint",2);

//        Employee e1 = new Employee("dpoint",5,10.0);
//        System.out.println(" Emp name is " +e1.getName());
//        System.out.println("Emp age is " + e1.getAge());
//        System.out.println("Emp salary is " + e1.getSalary());

//        Student student1 = new Student();


    }
}