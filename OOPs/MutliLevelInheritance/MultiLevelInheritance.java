package MutliLevelInheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C cd=new C();
        cd.displayA();
        cd.displayB();
        cd.displayC();
    };
}

class A{
    public void displayA(){
        System.out.println("This is class A");
    };

}
class B extends  A{

    public void displayB() {
        System.out.println("This is class B");
    };
}
class C extends  B {

    public void displayC() {
        System.out.println("This is class C");
    };
}
