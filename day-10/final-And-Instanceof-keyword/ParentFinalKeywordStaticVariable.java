public class ParentFinalKeywordStaticVariable{

    final static Integer parentVariable;

    // instance initializer block - not working, already initialization
    // completed for static variable
//    {
//        parentVariable = 10;
//    }

    //static block -will work because its executing at app start time
    static {
        parentVariable = 10;
    }

    // constructor - will not work
//    ParentFinalKeywordStaticVariable(){
//        parentVariable = 10;
//    }


    public Integer getParentVariable() {
        return parentVariable;
    }

//    public void setParentVariable(Integer iparentvariable) {
//        parentVariable = iparentvariable;
//    }

    Integer parentMethod(){
        System.out.println("this is ParentFinalKeywordStaticVariable");
        return parentVariable;
    }
}