public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Dog d=new Dog();
        d.printColor();
    }
}
class Animal{
      String color="white";
}
class Dog extends Animal{
      String color="black";
      void printColor(){
            System.out.println(color);
            System.out.println(super.color);
      }
}
