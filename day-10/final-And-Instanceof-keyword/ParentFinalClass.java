public class ParentFinalClass{

    Integer parentVariable;

    ParentFinalClass(){
        System.out.println(" def constructor " +
                "of ParentFinalKeywordInstanceVariable");
        parentVariable=20;
    }


    public Integer getParentVariable() {
        return parentVariable;
    }

    public void setParentVariable(Integer iparentvariable) {
        parentVariable = iparentvariable;
    }
}