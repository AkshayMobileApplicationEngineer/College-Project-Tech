package polymorphism;

public class Main {
      public static void main(String[] args) {
            Animal animal=new Animal();
            animal.makeSound();
            Dog dog=new Dog();
            dog.makeSound();
            Cat cat=new Cat();
            cat.makeSound();
      }
}
class Animal{
      public void makeSound(){
            System.out.println("Animal makes a sound");           
      }
}
class Dog extends Animal{
      public void makeSound(){
            System.out.println("Dog barks");
      }
}
class Cat extends Animal{
      public void makeSound(){
            System.out.println("Cat meows");
      }
}




