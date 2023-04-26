public class Person {
    public String name;
    private int age;

    //default constructor
    Person() {
        System.out.println("in the default constructor of person");
    }

    // parametarized constructor
    Person(String abcd) {
        System.out.println("in the parametarized constructor of person having string");
        name = abcd;
    }

    Person(int inputAge) {
        System.out.println("in the parametarized constructor of person having int");
        age = inputAge;
    }

    Person(String abcd, int inputAge) {
        name = abcd;
        age = inputAge;
        System.out.println("Person is initialized with name " + name +
                " and with age: " + age);
    }

    Person(int iage, String iname) {
        System.out.println("in the parametarized constructor " +
                "of person having int and string args");
        name = iname;
        age = iage;
    }


    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }


    void initialize(String abcd, int inputAge) {
        name = abcd;
        age = inputAge;
    }

    public void setName(String inputName) {
        System.out.println("setName method from class Person");
        name = inputName;
    }

    void setAge(int inputAge) {
        age = inputAge;
    }
}