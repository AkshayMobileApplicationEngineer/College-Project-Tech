public class TestSuper {
      public static void main(String[] args) {
          Dog d = new Dog();
          d.work();
      }
  }
  
  class Animal {
      void eat() {
          System.out.println("eating...");
      }
  }
  
  class Dog extends Animal {
      void eat() {
          System.out.println("eating bread...");
      }
  
      void bark() {
          System.out.println("barking...");
      }
  
      void work() {
          super.eat();  // Calls the eat method from Animal class
          bark();       // Calls the bark method from Dog class
      }
}
  