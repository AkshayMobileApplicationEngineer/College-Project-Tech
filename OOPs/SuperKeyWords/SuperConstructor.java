public class SuperConstructor {
      public static void main(String[] args) {
            Dog d = new Dog();
            d.print();
      }
}

class Animal {
      Animal() {
            System.out.println("animal is created");
      }
}

class Dog extends Animal {
      Dog() {
            super();
            System.out.println("dog is created");
      }
      
      public void print() {
            System.out.println("dog is printing");
      }
}