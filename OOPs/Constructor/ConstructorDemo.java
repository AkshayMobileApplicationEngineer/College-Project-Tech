package OOPs.Constructor;

public class ConstructorDemo {
    public static void main(String[] args) {
       @SuppressWarnings("unused")
    Student student=new Student(null, 0, 0); 
    }
}
class Student{
    int id;
    int age;
    String name;
    Student(String name,int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
        System.out.println(
            "hello world"
        );
        }
}
