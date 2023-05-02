public class Main {
    public static void main(String args[]) {
        // instance of
        Child c1 = new Child();
        System.out.println(c1);
        System.out.println(c1 instanceof Child);

        System.out.println();
        ParentFinalKeywordInstanceVariable p1 = new Child();
        System.out.println(p1);
        System.out.println(p1 instanceof Child);
        System.out.println(p1 instanceof ParentFinalKeywordInstanceVariable);


        ParentFinalKeywordInstanceVariable p2 = new ParentFinalKeywordInstanceVariable();
        System.out.println(p2);
        System.out.println("p2 instanceof Child :" + (p2 instanceof Child));
        System.out.println("p2 instanceof ParentFinalKeywordInstanceVariable : "+ (p2 instanceof ParentFinalKeywordInstanceVariable));















        // parent
//        ParentFinalKeywordStaticVariable p1 = new ParentFinalKeywordStaticVariable();
//        int result = p1.parentMethod();
//        System.out.println("result from " + result);
////        p1.setParentVariable(20);
//        System.out.println("updated parent variable value :"
//                + p1.getParentVariable());

        // child
//        Child c1 = new Child();
//        System.out.println("parentInstanceVariable : " +
//                c1.parentInstanceVariable);
//        System.out.println("parentVariable : " +
//                c1.parentVariable);
//        c1.parentMethod();

    }
}