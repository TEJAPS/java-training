public class MyClass {
   private int x;

   {
      // This is an instance initializer block
      x = 10;
      System.out.println("Instance initializer block called, x is set to " + x);
   }

   public MyClass() {
      System.out.println("Constructor called, x is " + x);
   }

   public static void main(String[] args) {
      MyClass myObj = new MyClass();
   }
}
