package OOPs.Inheritance;
class ParentClass
{
    void display()
    {
        System.out.println("Parent Class Method");
    }

    
}


class ChildClass extends ParentClass
{
    void show()
    {
        System.out.println("Child Class Method");
    }
}

class Vichale{
    int price;
    String color;
    int mileage;

    void displayFeature()
    {
        System.out.println(price+" "+color+" "+mileage);

    }
}
class Car extends Vichale
{
    int enginePower;
    int noOfSeats;
    void displayCarFeature()
    {
        System.out.println(enginePower+""+noOfSeats);
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        // ParentClass pc=new ParentClass();
        // pc.display();


        ChildClass childClass=new ChildClass();
        childClass.display();
        System.err.println();
        childClass.show();


        Car car=new Car();
        car.price = 10000;
        car.color = "Red";
        car.mileage = 10;
        car.enginePower = 2000;
        car.noOfSeats = 5;
        car.displayFeature();
        System.out.println();
        car.displayCarFeature();
        System.exit(0);  // Correct way to exit the program


    }
    
}

