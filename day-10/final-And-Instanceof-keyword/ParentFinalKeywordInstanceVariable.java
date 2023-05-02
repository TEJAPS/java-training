public class ParentFinalKeywordInstanceVariable{

    final Integer parentVariable;
    Integer parentInstanceVariable;

    // instance initializer block - working
//    {
//        parentVariable = 10;
//    }

    //static block - cannot modify instance variable
//    static {
//        parentVariable = 10;
//    }

    // constructor - working
    ParentFinalKeywordInstanceVariable(){
        System.out.println(" def constructor " +
                "of ParentFinalKeywordInstanceVariable");
        parentVariable = 10;
        parentInstanceVariable=20;
    }


    public Integer getParentVariable() {
        return parentVariable;
    }

//    public void setParentVariable(Integer iparentvariable) {
//        parentVariable = iparentvariable;
//    }

    final Integer parentMethod(){
        System.out.println("this is parentMethod");
        return parentVariable;
    }
}