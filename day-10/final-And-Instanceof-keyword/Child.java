public class Child extends ParentFinalKeywordInstanceVariable {

    Child(){
        super();
        System.out.println(" def constructor " +
                "of Child");
    }


    void childMethod(){
        System.out.println("this is childMethod");
    }
}